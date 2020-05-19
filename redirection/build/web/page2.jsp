<%-- 
    Document   : page2
    Created on : 9 Apr, 2020, 11:24:26 PM
    Author     : Anshu Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="background: greenyellow">
        <h1>This is page two</h1>
         <%
            
            // redirection to another page 
           // response.sendRedirect("page3.jsp");
            response.sendRedirect("http://www.facebook.com");
        
        %>
    </body>
</html>
