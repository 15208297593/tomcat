package com.utils;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class EncodingFilter extends HttpServlet implements Filter{
    private FilterConfig config = null;
    private String encoding = "";

    public void init(FilterConfig config) throws ServletException{
        this.config = config; //参数对象
        this.encoding = config.getInitParameter("encoding"); //编码
    }
    //编码过滤设置
    public void doFilter(ServletRequest request,ServletResponse response,FilterChain chain) throws java.io.IOException,ServletException{
        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;
        response.setCharacterEncoding(this.encoding); //设置输出编码方式
        java.io.PrintWriter out = res.getWriter();
        out.print("过滤器设置编码为: "+ this.encoding+"<br><br>");  //测试中文编码是否正确
        chain.doFilter(req, res);        
    }

}
