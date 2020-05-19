<%-- 
    Document   : error
    Created on : 8 Apr, 2020, 8:07:31 PM
    Author     : Anshu Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="p" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page errorPage="error_page.jsp" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello !</h1>
        <p:out value="${35+5}"></p:out>
        <%! 
            int a=5;
            int b=0;
        %>
        <% 
            int division=a/b;
            %>
            <h1>
                Division : <%=division%>
            </h1>
        
         
        
    </body>
</html>
