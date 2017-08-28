package com.utils;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitServlet extends HttpServlet {
    public static String project = ""; 
    
    public void init(ServletConfig conf) throws ServletException { 
        super.init(conf); 
        project = conf.getInitParameter("project"); 
    } 
 
    public void doGet(HttpServletRequest request,HttpServletResponse response) 
            throws ServletException, IOException { 
        response.setContentType("text/html"); 
        response.setCharacterEncoding("GB2312"); 
        PrintWriter out = response.getWriter(); 
        out.println("<HTML><HEAD><TITLE>A Servlet</TITLE>"); 
        out.println("<meta http-equiv=\"content-type\" content=\"text/html; charset=gb2312\">"); 
        out.print("</HEAD><BODY>"); 
        out.print("当前项目名称为："); 
        out.print(InitServlet.project); 
        out.println("</BODY></HTML>"); 
        out.flush(); 
        out.close(); 
    } 
 
    public void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException { 
        doGet(request, response); 
    } 
}
