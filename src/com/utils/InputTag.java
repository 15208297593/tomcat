package com.utils;

import java.io.IOException;

import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class InputTag extends TagSupport {
    public final static long serialVersionUID = 0 ;
    public String name;
    public String size;
    public String value;
    
    
    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public String getSize() {
        return size;
    }


    public void setSize(String size) {
        this.size = size;
    }


    public String getValue() {
        return value;
    }


    public void setValue(String value) {
        this.value = value;
    }


    public int doStartTag(){
        StringBuffer sb = new StringBuffer();
        sb = sb.append("<input type = \"text \" name=\"").append(name).append("\"").append(" size=\"").append(size).append("\"").append(" value=\"")
                .append(value).append("\"").append(">");
        try{
            JspWriter out = pageContext.getOut();
            out.print(sb.toString());
        }catch (IOException ioe){
        }
        return (SKIP_BODY);
    }
}
