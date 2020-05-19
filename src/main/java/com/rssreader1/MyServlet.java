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


@WebServlet("/myservlet")

public class MyServlet  extends HttpServlet{
	String buttonString ="";
	 protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		 		System.out.println("A " + buttonString);
		 
		 		System.out.println("HIDDEN "+ request.getParameter("flag"));
		 		request.setAttribute("url", request.getParameter("flag").toString());
		 	
		 	System.out.println("SERVLET "+buttonString+" " +request.getParameter("Oldest")+" "+request.getParameter("Newest") );

	       if (request.getParameter("Oldest") != null && buttonString.equals("Ascending")==false) {
	    	   System.out.println("1");
	    	   request.setAttribute("sort", "asc"); 
	    	   buttonString=request.getParameter("Oldest");
	    	   
	       }
	       else  if (request.getParameter("Newest") != null && buttonString.equals("Descending")==false) {
	    	   System.out.println("2");
		    	  request.setAttribute("sort", "desc"); 
		    	  buttonString=request.getParameter("Newest");
	    	   }
	       else {
	    	   System.out.println("3");
	    	   request.setAttribute("sort", "refresh"); 
	    	   buttonString="";
	       }
	 		System.out.println("B " + buttonString);

			 
	    	   //response.setHeader("Location", request.getContextPath() + "/MainPage.jsp");
	    	   
	        request.getRequestDispatcher("/MainPage.jsp").forward(request, response);
	        //response.sendRedirect("Old.jsp");
	        
	 		System.out.println("C " + buttonString);


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
