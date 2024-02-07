package controller;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import model.NewProduct;
import model.ProductSetGet;

import java.io.IOException;
import java.util.List;

/**
 * Servlet implementation class AddServlet
 */
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		int i=Integer.parseInt(request.getParameter("id"));
		String name=request.getParameter("name");
		int p=Integer.parseInt(request.getParameter("price"));
		int q=Integer.parseInt(request.getParameter("qty"));
		String date=request.getParameter("date");
		//System.out.println("Successful Product");
		
		NewProduct pro=new NewProduct();
		
		ProductSetGet pSG=pro.getProdcutInfo(i, name, p, q, date);
		
		System.out.println("Successful Product");
		
		Product o=new Product();
		List<ProductSetGet> p1=o.getAllProduct();
		
		System.out.println("Products size: "+p1.size());
	
		HttpSession  session=request.getSession();
		session.setAttribute("product",p1);
		RequestDispatcher r=request.getRequestDispatcher("display.jsp");
		r.forward(request, response);
		//request.setAttribute("myProduct", pSG);
		/*
		 * RequestDispatcher rs=request.getRequestDispatcher("/display.jsp");
		 * rs.include(request, response);
		 */
		
		}

}
