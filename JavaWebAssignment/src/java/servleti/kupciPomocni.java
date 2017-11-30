package servleti;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import klase.kupci;
import klase.proizvodi;

public class kupciPomocni {
	
   public boolean kreirajKupca(kupci c){
            try{
										
            Class.forName("com.mysql.jdbc.Driver"); 
										
            Connection conn=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/prodavnica","admin","admin"); 
            Statement stmt=conn.createStatement();  
	    ResultSet rt=stmt.executeQuery("select max (CUST_ID) from kupci");
	    int id=0;
		while(rt.next()){  
		id= rt.getInt(1);
														
	    }
        String query="insert into kupci("+(id+1)+",'" + c.getLastName()+"','"+c.getFirstName()+"','"+c.getEmailID()+"','"+c.getPassword()+"',')";
	    System.out.println("--***---" +query);
		int rs=stmt.executeUpdate(query);
	    
	    conn.close(); 
														
		return true;
		}catch(Exception e) {System.out.println(e);} 
		return false;
		}
						
		public List nadjiKupca(int pageSize,int pageNumber){
		List<kupci> list= new ArrayList<kupci>();
                try{  
                Class.forName("com.mysql.jdbc.Driver"); 

                Connection conn=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  

                Statement stmt=conn.createStatement();
                int startRow=(pageNumber-1)*pageSize+1;
                int endRow=pageNumber*pageSize;


                ResultSet rs=stmt.executeQuery("Select Cust_ID,LastName,FirstName,EmailID, FROM kupci");

                kupci e= null;
                while(rs.next()){  
                e= new kupci(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5));
                list.add(e);
                } 
                conn.close();  
                }catch(Exception e){ System.out.println(e);}
                finally{
                        return list;
                }
                                }
                public boolean dodajUKorpu(String productId, String customerId){
                try{
                Class.forName("com.mysql.jdbc.Driver"); 
                Connection conn=DriverManager.getConnection(  
                "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  
                Statement stmt=conn.createStatement();  


                ResultSet rt=stmt.executeQuery("select max (narudzba_Id) from narudzba");
                int id=0;
                while(rt.next()){  
                id= rt.getInt(1);

                }
                String query="insert into narudzba value("+(id+1)+","+productId+",1,'O',null,"+customerId+")";
                System.out.println("--***---" +query);
                int rs=stmt.executeUpdate(query);

                conn.close(); 

                return true;
                }catch(Exception e) {System.out.println(e);} 
                return false;
                }
                                                
	public boolean isPresentInCart(String productId) throws SQLException, ClassNotFoundException{
	boolean present=false;
	
	Class.forName("com.mysql.jdbc.Driver"); 
									
		Connection con=DriverManager.getConnection(  
"jdbc:mysql://localhost:3306/prodavnica","admin","admin");  
												  
	
	Statement stmt=con.createStatement();  
											  
	
	ResultSet rt=stmt.executeQuery("select count(*) from Cart where PROD_ID="+productId+" and status ='O'");
	int count=0;
	
	while(rt.next()){  
	count= rt.getInt(1);
												
	}
	if(count>0){
		present=true;
	}
        
	con.close(); 
        
        
       return false;
        }
        
        public boolean deleteCartProduct(int productId){
	try{
	Class.forName("com.mysql.jdbc.Driver"); 
									
	Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  
                
	Statement stmt=con.createStatement();
	String query="delete from Cart where PROD_ID="+productId+ " and status='O'";
	ResultSet rt=stmt.executeQuery(query);
	
	System.out.println(query);
		return true;
		}catch(Exception e){ 
		return false;
                }
        }
        public boolean addToCart(String productId, String customerId){
						
        try{
        Class.forName("com.mysql.jdbc.Driver"); 
									
        Connection con=DriverManager.getConnection(  
        "jdbc:mysql://localhost:3306/prodavnica","admin","admin");  
        Statement stmt=con.createStatement();  

       
        ResultSet rt=stmt.executeQuery("select max (cart_Id) from cart");
        int id=0;
        while(rt.next()){  
        id= rt.getInt(1);

        }
        String query="insert into korpa values("+(id+1)+","+productId+",1,'O',null,"+customerId+")";
        System.out.println("--***---" +query);
        int rs=stmt.executeUpdate(query);
        //step5 close the connection object  
        con.close(); 

        return true;
        }catch(Exception e) {System.out.println(e);} 
        return false;
        }	
public List cartItems(String customerId){
	
 List <proizvodi> list= new ArrayList<proizvodi>();
	
	try{
	Class.forName("com.mysql.jdbc.Driver"); 
									
            Connection con=DriverManager.getConnection(  
            "jdbc:mysql://localhost:3306/prodavnica","admin","admin");
	Statement stmt=con.createStatement();  
												  
	
	String query="select PRODUCT.PROD_ID,PRODUCT.PROD_NAME,PRODUCT.PROD_DESCRIPTION,PRODUCT.PROD_PRICE,cart.quantity FROM Cart INNER JOIN PRODUCT ON Cart.PROD_ID=PRODUCT.PROD_ID and cart.status='O'and cart.Cust_ID="+customerId;
	ResultSet rt=stmt.executeQuery(query);
	proizvodi pro=null;
	while(rt.next()){  
		pro= new proizvodi(rt.getInt(1),rt.getString(2), rt.getFloat(3));
		list.add(pro);
		
		} 
	
	//step5 close the connection object  
	con.close(); 
												

	}catch(Exception e) {System.out.println(e);} 
	finally{
	return list ;
	}
		
						
		
						}
											

													
}
