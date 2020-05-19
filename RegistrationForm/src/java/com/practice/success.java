
package com.practice;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class success extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Sucessfully Registered");
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("<h2> This is Success Servlet</h2>");
        out.println("<h2>Sucessfully Registerd...</h2>");
        
        
        
    }
    
    
}
