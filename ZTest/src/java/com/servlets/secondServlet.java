
package com.servlets;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class secondServlet extends GenericServlet {

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //To change body of generated methods, choose Tools | Templates.
        //implementing method of GenericServlet
        System.out.println("this is using GenercServlet");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.println("<h1>This is Generic Servlet</h1>");
        out.println("<h2> The date and Time is "+new Date().toString()+"</h2>");
        
    }
    
    
}
