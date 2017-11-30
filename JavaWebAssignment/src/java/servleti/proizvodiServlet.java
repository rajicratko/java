package servleti;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import klase.proizvodi;
/**
 * Servlet implementation class ProductServlet
 */
@WebServlet("/Products")
public class proizvodiServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public proizvodiServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		RequestDispatcher rd= null;
		proizvodiPomocni helper= new proizvodiPomocni();
		String action= request.getParameter("action");
		int pageNumber=1;
		int pageSize=5;
		String page=request.getParameter("pageNumber");
		if(page!=null){pageNumber=Integer.parseInt(page);}
		
		String target=null;
		
//		 if(action.equals("search")){
//			
//			String search=request.getParameter("search");
//			int numProducts=helper.getNumProducts(search);
//			List products=(List)helper.searchProducts(search,pageSize,pageNumber);
//			request.setAttribute("numProducts",numProducts);
//			request.setAttribute("products",products);
//			target="Products.jsp";
//		 
//		
//		 }
		if(action.equals("add")){
			
			String productName= request.getParameter("productName");
			float productPrice= Float.parseFloat(request.getParameter("productPrice"));
			String productDescription= request.getParameter("productDescription");
			String productType= request.getParameter("productType");
			proizvodi p= new proizvodi(0, productName, productPrice);
		
			boolean status=helper.createProduct(p);
			if(status){
				List products=(List)helper.getProducts(pageSize,pageNumber);
				request.setAttribute("products",products);
				target="Products?action=search";
				
				}
			
			
		}
		else if(action.equals("view")){
			
			int productId=Integer.parseInt(request.getParameter("productId"));
			proizvodi product=helper.getProduct(productId);
			request.setAttribute("product",product);
			target="ViewProduct.jsp";
		}
		else if(action.equals("edit")){
			
			int productId=Integer.parseInt(request.getParameter("productId"));
			proizvodi proizvodi=helper.getProduct(productId);
			request.setAttribute("proizvodi",proizvodi);
			 target="proizvodi.jsp";
		}
		else if(action.equals("update")){
			int productId=Integer.parseInt(request.getParameter("productId"));
			String productName= request.getParameter("productName");
			
			float productPrice= Float.parseFloat(request.getParameter("productPrice"));
			String productDescription= request.getParameter("productDescription");
			String productType= request.getParameter("productType");
			proizvodi p= new proizvodi(productId, productName, productPrice);
	
			boolean status=helper.updateProduct(p);
			if(status){
				List products=(List)helper.getProducts(pageSize, pageNumber);
				request.setAttribute("products",products);
				target="Products?action=search";
				
				}
			
			
		}
		 helper.close();
		 request.getRequestDispatcher(target).forward(request,response);
	
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
