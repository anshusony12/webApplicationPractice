
package com.servlets;
import javax.servlet.*;
import java.io.*;
import java.util.Date;





public class firstServlet implements Servlet {
    ServletConfig conf;
    // life cycle methods
    
    public void init(ServletConfig conf){
        this.conf=conf;
        System.out.println("Creating objects:..........");
        
    }
    public void service(ServletRequest req, ServletResponse resp)throws ServletException, IOException {
        System.out.println("Servicing......");
        //set the content type of the response
        resp.setContentType("text/html");
        PrintWriter out =resp.getWriter();
        out.println("<h1> This is my output from servlet method</h1>");
        out.println("<h2>todays date and time is ="+new Date().toString()+"</h2>");
    }
    public void destroy(){
        System.out.println("going to destroy servlet objects....");
    }
    public ServletConfig getServletConfig(){
        return this.conf;
    }
    public String getServletInfo(){
        return "this servlet is created by Anshu Sony";
    }
}
