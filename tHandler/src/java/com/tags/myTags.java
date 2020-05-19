/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tags;

import java.util.Date;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

/**
 *
 * @author Anshu Sony
 */
public class myTags extends TagSupport {

    @Override
    public int doStartTag() throws JspException {
        try {
            JspWriter out=pageContext.getOut();
            out.println("<h1> this is my custom Tag</h1>");
            out.print(new Date().toString());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return SKIP_BODY;
    }

}
