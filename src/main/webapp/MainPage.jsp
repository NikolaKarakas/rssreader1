<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.ArrayList" %>
<%@ page import="com.rssreader1.GetXml" %>
<%@ page import="com.rssreader1.Item" %>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>


<!DOCTYPE html>
<html lang="en">
<link rel="stylesheet" href="bootstrap/css/bootstrap.min.css" type="text/css">


<head>
<title>Title</title>
<meta charset="ISO-8859-1">

</head>
<style type="text/css">
	.center {
  display: block;
  margin-left: auto;
 
  width: auto;
  
}
.img {
    width: 100%;
}

  .lb-sm {
  font-size: 28px;
}

.custom {
    min-width: auto;
    min-height: auto;
    font-size: 28px;
   
}
	
	.container {
        padding-left: auto;
  padding-right: auto;
  margin-right: auto;
  margin-left: auto;;
    }
	
</style>
<body style="background-color:powderblue;">

<%
System.out.println("EVO ");


GetXml getXml = null;
ArrayList<Item> normalList = null;
String urlString = null;
		if(request.getAttribute("url")==null)
			{System.out.println("NARASD");}
		else{
		System.out.println("MAIN.JSP URL " + request.getAttribute("url").toString());
		 urlString=request.getAttribute("url").toString();
		 getXml = new GetXml(request.getAttribute("url").toString());
		 normalList = getXml.getItems();
		//value="<%=request.setAttribute("url", request.getAttribute("url").toString())
		}
		%>

<!-- As a heading -->




<div class="container-fluid">

<div class ="row">
	<div class="col-xs-6 col-xl-12">
		<nav class="navbar navbar-light bg-light">
		  <span class="navbar-brand mb-1 h1">Navbar</span>
		  
		  
		  	<div class = "center">
		 	
		    	
					    	<div class="input-group input-group-sm mb-3">
					    	<form action="/reload" method="post">
					    				<input type="hidden" name="flag1" value="<%=urlString%>" >
					    	
					   	 		<input type="submit" name="fetch" value="Reload/Fetch" class ="btn btn-light" >
		    	</form>
						</div>
		    	</div>
		  
		</nav>
	</div>

</div>


	
<div class = "row">
	<div class="col-sm">
		<form action="/myservlet" method="post">
			<input type="hidden" name="flag" value="<%=urlString%>" >
			<label>            Order by</label><br>
   	 		<input type="submit" name="Oldest" value="Ascending" class ="btn btn-light" ><br><br>
    		<input type="submit"name="Newest" value="Descending" class ="btn btn-light"><br>
    	</form>
    </div>
    	<div class="col-sm">
    	</div>
  
  		<div class = "col-sm">
 	
    	
			    	<form action="/redirect" method="post">
			 			 <div class="input-group-prepend">
			    		<span class="input-group-text" id="inputGroup-sizing-sm" >Insert URL Source</span>
					  </div>
			  		<input type="text" class="form-control" name="input1" aria-label="Small" aria-describedby="inputGroup-sizing-sm">
			  		</form>
				
    	</div>
</div><br><br><br>
    	
  		
	
   

	<% 
 	System.out.println("JSP "+request.getAttribute("sort")+" " +request.getParameter("button1")+" "+request.getParameter("button2") );
	if(normalList!=null){
	normalList = getXml.getItems();
	if(request.getAttribute("sort")=="desc")
		normalList=getXml.sort_items_descending(normalList);
	else if(request.getAttribute("sort")=="asc")
	normalList=getXml.sort_items_ascending(normalList);
	else 
		normalList=getXml.getItems();
	 System.out.println(request.getAttribute("sort")+"------BODY------");

	for (int i = 0 ; i <normalList.size(); i ++){

	//style="width: 400px; height: 300px;"
	
		%>
		
		

		
<div class ="row">
	<div class = "col-xs-6 col-xl-6 ">
				<h3><%=normalList.get(i).getTitle()%> <button type="button" class="btn btn-link custom">Link</button>
				</h3>
				
				<br>
				<label class="lb-sm"><%=normalList.get(i).getDate()%></label>
	</div>
	
	<div class =" col-xs-6 col-xl-6" >
				<img src="<%=normalList.get(i).getImage()%>" class="img-responsive">
				
	</div>	
	
</div>	<br>
		
	<%}}%> 
	
</div>
</body>
</html>