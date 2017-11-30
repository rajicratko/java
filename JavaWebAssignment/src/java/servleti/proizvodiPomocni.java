package servleti;

import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import klase.proizvodi;

public class proizvodiPomocni {
	
	
	Connection conn;
	 
	public proizvodiPomocni(){
		try{Class.forName("com.mysql.jdbc.Driver");  
                        Connection conn=DriverManager.getConnection(  
                            "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  	
                            
		
	}catch(Exception e){ System.out.println(e);}
		
	}
	
	
	public void close(){
		try {
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public List getProducts(int pageSize, int pageNumber){
		List<proizvodi> list= new ArrayList<proizvodi>();
			try{  
			Class.forName("com.mysql.jdbc.Driver");  
                        Connection conn=DriverManager.getConnection(  
                            "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  	
                            
				Statement stmt=conn.createStatement();  
				
				int startRow=(pageNumber-1)*pageSize+1;
				int endRow=pageNumber*pageSize;
				
				ResultSet rs=stmt.executeQuery("Select * FROM(Select t.*, rownum r from proizvod t) Where r >="+startRow+" and r <="+endRow);
				
				
				
				
				}catch(Exception e){ System.out.println(e);}
				finally{
					return list;
				}
				}
//	public List searchProducts(String search,int pageSize, int pageNumber){
//		List<proizvodi> list= new ArrayList<proizvodi>();
//			try{  
//                            Statement stmt=conn.createStatement();  
//				Class.forName("com.mysql.jdbc.Driver");  
//                        Connection con=DriverManager.getConnection(  
//                            "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  	
//			ResultSet rs=stmt.executeQuery("Select * FROM(Select t.*, rownum r from proizvod t where t.productName like '%"+search+"%') Where r >="+startRow+" and r <="+endRow);	
//				int startRow=(pageNumber-1)*pageSize+1;
//				int endRow=pageNumber*pageSize;
//				if(search==null){
//					search="";
//				}
//				  
//				proizvodi e= null;
//				while(rs.next()){  
//				e= new proizvodi(rs.getInt(1),rs.getString(2),rs.getInt(3), rs.getFloat(4),rs.getString(5),rs.getString(6));
//				list.add(e);
//				} 
//			}catch(Exception e){ System.out.println(e);}
//				finally{
//					return list;
//				}
//	}
			
    public boolean createProduct(proizvodi p){
    try{

    Statement stmt=conn.createStatement(); 



    ResultSet rt=stmt.executeQuery("select max (PROD_ID) from proizvod");
    int id=0;
    while(rt.next()){  
    id= rt.getInt(1);

    }
    String query="insert into proizvod values("+(id+1)+",'" + p.getProductName()+"'',"+p.getProductPrice()+"','"+p.getProductType()+"')";

    int rs=stmt.executeUpdate(query);
    return true;
    }catch(Exception e) {System.out.println(e);}
    return false;
                }

    public proizvodi getProduct(int productId){
        proizvodi product=null;
                try{  
        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("select * from proizvodi where PROD_ID="+productId);

        }catch(Exception e){ System.out.println(e);}
        finally{
                return product;
        }
        }
        public boolean updateProduct(proizvodi p){
        try{  
            Statement stmt=conn.createStatement(); 
            String query="update Product set Prod_Name='"+p.getProductName()+"',Prod_Price="+p.getProductPrice()+"'Prod_Type='"+p.getProductType()+"' where Prod_Id="+p.getProductId();

            System.out.println("--***---" +query);
            int rs=stmt.executeUpdate(query);
            return true;
            }catch(Exception e) {System.out.println(e);}
            return false;
            }
        public int getNumProducts(String search){
          int count= 0;
            try{  

            Statement stmt=conn.createStatement();  
            String query=null;
                if(search==null){
                   query="select count(*) from PRODUCT";
              }else{
                   query="select count(*) from PRODUCT where PROD_NAME like '%"+search+"%'";
              }
            System.out.println(query);
            ResultSet rs=stmt.executeQuery(query);
            while(rs.next()){  
            count=rs.getInt(1);
            }
            }catch(Exception e){ System.out.println(e);}
            finally{
                    return count;
            }
            }
    }
	



