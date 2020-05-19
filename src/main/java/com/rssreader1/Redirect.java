package com.rssreader1;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;


@WebServlet("/redirect")

public class Redirect  extends HttpServlet{
	
	private String urlString;
	 public String getUrlString() {
		return urlString;
	}




	public void setUrlString(String urlString) {
		this.urlString = urlString;
	}




	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		 urlString= request.getParameter("input1");
		 System.out.println("URL "+ urlString);
			 		request.setAttribute("url", urlString);
			 		
	    	   //response.setHeader("Location", request.getContextPath() + "/MainPage.jsp");
	    	   
	        request.getRequestDispatcher("/MainPage.jsp").forward(request, response);
	        //response.sendRedirect("Old.jsp");
	        


	    }
	 
	 
	 
	 
	 protected void doGet(HttpServletRequest request, 
             HttpServletResponse response) 
throws ServletException, IOException 
{ 
processRequest(request, response); 
} 
	 
@Override
protected void doPost(HttpServletRequest request, 
             HttpServletResponse response) 
throws ServletException, IOException 
{ 
processRequest(request, response); 

} 

}
