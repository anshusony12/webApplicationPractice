
package com.myservlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.*;
import javax.servlet.http.*;




public class MyServlet extends HttpServlet{
       public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException {
           System.out.println("This is my Http Servlet......");
           response.setContentType("text/html");
           PrintWriter out = response.getWriter();
           out.println("<h1>This is my Http Servlet</h1>");
           out.println(new Date().toString());
           
       }
}

