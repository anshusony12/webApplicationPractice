
package com.session;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class servlet2 extends HttpServlet {

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet servlet2</title>");            
            out.println("</head>");
            out.println("<body>");
            // getting all the values of cookies.....
            Cookie cookies[]=request.getCookies();
            
            String name="";
            boolean f=false;
            
            if(cookies==null){
                out.println("<h1>Sorry you are a new user, please go to homepage and submit your name</h1>");
                return;
            }
            else{
                for(Cookie c:cookies){
                    String tname=c.getName();
                    if(tname.equals("user_name")){
                        f=true;
                        name=c.getValue();
                    }
                }
            }
            if(f){
                out.println("<h1>Hello..! " + name + " Welcome back to my website..</h1>");
                out.println("<h1>Thank you..........!</h1>");
                
            }
            else{
                out.println("<h1>Sorry you are a new user, please go to homepage and submit your name</h1>");
                out.println("</body>");
                out.println("</html>");
            }
        }
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }
}
