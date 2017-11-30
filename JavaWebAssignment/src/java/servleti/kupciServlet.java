package servleti;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/kupciServlet")
public class kupciServlet extends HttpServlet {
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public kupciServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
            proizvodiPomocni pp= new proizvodiPomocni();
		String action= request.getParameter("action");
		kupciPomocni ch= new kupciPomocni();
		 	
		
					
		   if(action.equals("Dodaj")){
		   	  String productId=request.getParameter("productId");
		   	  String customerId=request.getSession().getAttribute("customerId").toString();
                try {
                    if(!ch.isPresentInCart(productId)){
                        boolean status=ch.addToCart(productId,customerId);
                        request.setAttribute("message", "Dodato u korpu");
                    }
                } catch (SQLException ex) {
                    Logger.getLogger(kupciServlet.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(kupciServlet.class.getName()).log(Level.SEVERE, null, ex);
                }
			  
		  }else if(action.equals("dodajUKorpu")){
		   	  String productId=request.getParameter("productId");
		   	  String customerId=request.getSession().getAttribute("customerId").toString();
                    try {
                        if(!ch.isPresentInCart(productId)){
                            boolean status=ch.addToCart(productId,customerId);
                            request.setAttribute("message", "Added to Cart");
                        }
                    } catch (SQLException ex) {
                        Logger.getLogger(kupciServlet.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(kupciServlet.class.getName()).log(Level.SEVERE, null, ex);
                    }
		  	
		  		}else if(action.equals("logout")) {
		  			request.getSession().invalidate();
					request.getRequestDispatcher("index.jsp").forward(request, response);
							
		  			
		  		}
		 
		 else {
		
		String firstName=request.getParameter("firstName");
		String lastName=request.getParameter("lastName");
		String gender=request.getParameter("gender");
		String emailId=request.getParameter("emailId");
		String password=request.getParameter("password");
		String phoneNumber=request.getParameter("phoneNumber");
		
		System.out.println("*** in kupci servlet");
	
	
	
                                }
	
	}
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
