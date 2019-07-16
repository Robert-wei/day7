package com.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;


public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setCharacterEncoding("utf-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println("username:"+username+",password:"+password);


        String msg = "";
        if(username!=null && !username.equals("")){
            msg = "登录成功";
        }else{
            msg = "登录失败";
        }

        // 为了解决响应流的乱码问题，所以需要设置响应对象的编码
        resp.setCharacterEncoding("utf-8");
        //告诉浏览器以什么编码方式执行
        resp.setContentType("text/html;charset=utf-8");
        // 获得响应对象的输出流
        PrintWriter out = resp.getWriter();
        // 将数据返回给客户
        out.println(msg);
    }
}
