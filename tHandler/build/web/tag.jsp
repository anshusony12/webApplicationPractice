<%-- 
    Document   : tag
    Created on : 9 Apr, 2020, 5:14:07 PM
    Author     : Anshu Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="/WEB-INF/tlds/lib" prefix="r" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <r:myTag> </r:myTag>
        <r:printTable number="5" color="blue"></r:printTable>
        <r:printTable number="10" color="red"></r:printTable>
    </body>
</html>
