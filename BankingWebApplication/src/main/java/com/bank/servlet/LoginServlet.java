package com.bank.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served a3t: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username=request.getParameter("username");
		String password=request.getParameter("password");
		
		System.out.println(username);
		System.out.println(password);
		
		//PrintWriter writer=response.getWriter();
		
		/*String htmlResponse="<html>";
		htmlResponse+="<h3> UserName :"+username+"</h3>";
		htmlResponse+="<h3> Password :"+password+"</h3>";
		htmlResponse+="</html>";*/
		//doGet(request, response);
		if(username.equals("Mani")&&password.equals("1234"))
		{
			RequestDispatcher reqDispatch=request.getRequestDispatcher("AdminOptions.jsp");
			reqDispatch.forward(request,response);
		}
		else
		{
			RequestDispatcher reqDispatch=request.getRequestDispatcher("CustomerOptions.jsp");
			reqDispatch.forward(request,response);
		}	
	}

}
