<%-- 
    Document   : error_page
    Created on : 8 Apr, 2020, 8:22:48 PM
    Author     : Anshu Sony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page isErrorPage="true" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Error_Page</title>
        <style>
            *{
                 margin: 0px;
                 padding: 0px;
            }
        </style>
        
    </head>
    <body>
        <div style="background: grey; color:blue; padding: 20px ">
            <h1>Something went wrong....</h1>
            <p><%=exception%></p>
        </div>
    </body>
</html>
