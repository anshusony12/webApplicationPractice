
package com.user;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class Register extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            //fetching all the iput fields form the jsp page
                String name=request.getParameter("user_name");
                String email=request.getParameter("user_email");
                String password=request.getParameter("user_password");
                Part part=request.getPart("image");
                String filename=part.getSubmittedFileName();
                //out.println(filename);
            //create connection in mysql
                try{
                    Thread.sleep(1000);
                    Class.forName("com.mysql.jdbc.Driver");
                    String url="jdbc:mysql://localhost:3306/registration";
                    Connection con=DriverManager.getConnection(url,"root","root");
                    String querry="insert into reg-users(name,email,password,image)values(?,?,?,?)";
                    PreparedStatement stmt=con.prepareStatement(querry);
                    stmt.setString(1, name);
                    stmt.setString(2,email);
                    stmt.setString(3,password);
                    stmt.setString(4,filename);
                    stmt.executeUpdate();
                    //to get byte data from image inputs
                    InputStream is=part.getInputStream();
                    byte b[]=new byte[is.available()];
                    is.read(b);
                    // produce output into new folder
                    String path=request.getRealPath("/")+"image"+File.separator+filename;
                    //out.println(path);
                    FileOutputStream fos= new FileOutputStream(path);
                     fos.write(b);
                     fos.close();
                    
                    
                    out.println("Done....");
                }
                catch(Exception e){
                    e.printStackTrace();
                    out.println("Error....");
                }
            
            
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
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
    }// </editor-fold>

}
