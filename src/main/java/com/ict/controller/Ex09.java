package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex09")
public class Ex09 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		//요청
		request.setCharacterEncoding("utf-8");
		//응답
		response.setContentType("text/html ; charset utf-8");
		// 화면출력
		PrintWriter out = response.getWriter();
		
		
		
		// 배열 파라미터 
		
		String[] hobby = request.getParameterValues("hobby");
		String[] web = request.getParameterValues("web");
		
		//배열로 받으면 반복문으로
		
		try {
		out.println("<h2>결과보기 </h2>");
		out.println("<h3><ul>");
		
		for (String k : hobby) {
			out.println("<li>"+k+"</li>");
		}
		
		out.println("</ul></h3>");
		out.println("<hr>");
		
		
		out.println("<h3><ul>");
		for (String k : web) {
			out.println("<li>"+k+"</li>");
		}
		
		out.println("</ul></h3>");
		out.println("<hr>");
		
		// 실행은 HTML 에서 하기 

		} catch (Exception e) {
			out.println("<p>선택다시해!! </p>");
		}
		
	}



}
