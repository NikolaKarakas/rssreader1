/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: jetty/9.4.12.v20180830
 * Generated at: 2020-05-19 06:53:19 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import com.rssreader1.GetXml;
import com.rssreader1.Item;

public final class MainPage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("file:/C:/Users/TOSHIBA/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1585989255238L));
    _jspx_dependants.put("jar:file:/C:/Users/TOSHIBA/.m2/repository/org/apache/taglibs/taglibs-standard-impl/1.2.5/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425975070000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.rssreader1.GetXml");
    _jspx_imports_classes.add("com.rssreader1.Item");
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\" type=\"text/css\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("<title>Title</title>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("\t.center {\r\n");
      out.write("  display: block;\r\n");
      out.write("  margin-left: auto;\r\n");
      out.write(" \r\n");
      out.write("  width: auto;\r\n");
      out.write("  \r\n");
      out.write("}\r\n");
      out.write(".img {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("  .lb-sm {\r\n");
      out.write("  font-size: 28px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".custom {\r\n");
      out.write("    min-width: auto;\r\n");
      out.write("    min-height: auto;\r\n");
      out.write("    font-size: 28px;\r\n");
      out.write("   \r\n");
      out.write("}\r\n");
      out.write("\t\r\n");
      out.write("\t.container {\r\n");
      out.write("        padding-left: auto;\r\n");
      out.write("  padding-right: auto;\r\n");
      out.write("  margin-right: auto;\r\n");
      out.write("  margin-left: auto;;\r\n");
      out.write("    }\r\n");
      out.write("\t\r\n");
      out.write("</style>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");

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
		
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- As a heading -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("<div class =\"row\">\r\n");
      out.write("\t<div class=\"col-xs-6 col-xl-12\">\r\n");
      out.write("\t\t<nav class=\"navbar navbar-light bg-light\">\r\n");
      out.write("\t\t  <span class=\"navbar-brand mb-1 h1\">Navbar</span>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t  \t<div class = \"center\">\r\n");
      out.write("\t\t \t\r\n");
      out.write("\t\t    \t\r\n");
      out.write("\t\t\t\t\t    \t<div class=\"input-group input-group-sm mb-3\">\r\n");
      out.write("\t\t\t\t\t    \t<form action=\"/reload\" method=\"post\">\r\n");
      out.write("\t\t\t\t\t    \t\t\t\t<input type=\"hidden\" name=\"flag1\" value=\"");
      out.print(urlString);
      out.write("\" >\r\n");
      out.write("\t\t\t\t\t    \t\r\n");
      out.write("\t\t\t\t\t   \t \t\t<input type=\"submit\" name=\"fetch\" value=\"Reload/Fetch\" class =\"btn btn-light\" >\r\n");
      out.write("\t\t    \t</form>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t    \t</div>\r\n");
      out.write("\t\t  \r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("<div class = \"row\">\r\n");
      out.write("\t<div class=\"col-sm\">\r\n");
      out.write("\t\t<form action=\"/myservlet\" method=\"post\">\r\n");
      out.write("\t\t\t<input type=\"hidden\" name=\"flag\" value=\"");
      out.print(urlString);
      out.write("\" >\r\n");
      out.write("\t\t\t<label>            Order by</label><br>\r\n");
      out.write("   \t \t\t<input type=\"submit\" name=\"Oldest\" value=\"Ascending\" class =\"btn btn-light\" ><br><br>\r\n");
      out.write("    \t\t<input type=\"submit\"name=\"Newest\" value=\"Descending\" class =\"btn btn-light\"><br>\r\n");
      out.write("    \t</form>\r\n");
      out.write("    </div>\r\n");
      out.write("    \t<div class=\"col-sm\">\r\n");
      out.write("    \t</div>\r\n");
      out.write("  \r\n");
      out.write("  \t\t<div class = \"col-sm\">\r\n");
      out.write(" \t\r\n");
      out.write("    \t\r\n");
      out.write("\t\t\t    \t<form action=\"/redirect\" method=\"post\">\r\n");
      out.write("\t\t\t \t\t\t <div class=\"input-group-prepend\">\r\n");
      out.write("\t\t\t    \t\t<span class=\"input-group-text\" id=\"inputGroup-sizing-sm\" >Insert URL Source</span>\r\n");
      out.write("\t\t\t\t\t  </div>\r\n");
      out.write("\t\t\t  \t\t<input type=\"text\" class=\"form-control\" name=\"input1\" aria-label=\"Small\" aria-describedby=\"inputGroup-sizing-sm\">\r\n");
      out.write("\t\t\t  \t\t</form>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("    \t</div>\r\n");
      out.write("</div><br><br><br>\r\n");
      out.write("    \t\r\n");
      out.write("  \t\t\r\n");
      out.write("\t\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("\t");
 
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
	
		
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("<div class =\"row\">\r\n");
      out.write("\t<div class = \"col-xs-6 col-xl-6 \">\r\n");
      out.write("\t\t\t\t<h3>");
      out.print(normalList.get(i).getTitle());
      out.write(" <button type=\"button\" class=\"btn btn-link custom\">Link</button>\r\n");
      out.write("\t\t\t\t</h3>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<br>\r\n");
      out.write("\t\t\t\t<label class=\"lb-sm\">");
      out.print(normalList.get(i).getDate());
      out.write("</label>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t\r\n");
      out.write("\t<div class =\" col-xs-6 col-xl-6\" >\r\n");
      out.write("\t\t\t\t<img src=\"");
      out.print(normalList.get(i).getImage());
      out.write("\" class=\"img-responsive\">\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t</div>\t\r\n");
      out.write("\t\r\n");
      out.write("</div>\t<br>\r\n");
      out.write("\t\t\r\n");
      out.write("\t");
}}
      out.write(" \r\n");
      out.write("\t\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
