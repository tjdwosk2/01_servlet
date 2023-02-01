package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex12_2")
public class Ex12_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//요청
		request.setCharacterEncoding("utf-8");
		
		//응답
		
		response.setContentType("text/html; charset utf-8");
		
		//화면출력
		PrintWriter out = response.getWriter();
		
		int lucky = (int)(Math.random()*101);
		
		out.println("<h2>Ex12_2   페이지 (운세 구하기) </h2>");
		out.println("<h3>"+ lucky + "% 입니다. </h3>");
		
	}

	

}
