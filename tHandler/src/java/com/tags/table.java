/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tags;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Anshu Sony
 */
public class table extends TagSupport{
    int number;
    String color;

    public void setNumber(int number) {
        this.number = number;
    }

    public void setColor(String color) {
        this.color = color;
    }
        
    @Override
    public int doStartTag() throws JspException {
        
        try {
            JspWriter out=pageContext.getOut();
            out.println("<hr>");
            out.println("<h2>This is Table: </h2>");
            out.println("<div style='color: "+color+"'");
            for(int i=1; i<=10;i++){
                out.println(i*number+"<br>");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }
    
    
}
