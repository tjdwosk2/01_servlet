package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex04")
// 애노테이션?
public class Ex04 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // 응답에 대한 한글 처리를 해줄수있다 .
        response.setContentType("text/html; charset=utf-8");
        
        // 출력을 위한 처리
        PrintWriter out = response.getWriter();

        out.print("<a href='Ex03'>문서3</a><br>"); // 상대주소
        out.print("<a href='/01_servlet/Ex03'>문서3</a><br>"); // 절대주소
        out.print("<a href='"+request.getContextPath()+"/Ex03'>문서3</a><br>");
      
    }

}