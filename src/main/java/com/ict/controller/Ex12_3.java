package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex12_3")
public class Ex12_3 extends HttpServlet {
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
		
		
		int su1 = Integer.parseInt(request.getParameter("s1"));
		int su2 = Integer.parseInt(request.getParameter("s2"));
		
		String op = request.getParameter("op");
		try {
			int result = 0;
			switch (op) {
			case "+":result = su1+su2; break;
			case "-":result = su1-su2; break;
			case "*":result = su1*su2; break;
			case "/":result = su1/su2; break;
			
				
			
			}
			out.println("<h2>" + su1 + op + su2 + "=" +result+"</h2>");
		} catch (Exception e) {
			out.println("<h2> 0으로는 나눌수 없습니다</h2> ");
			
		}
		
		
	
		out.println("<h2>Ex12_3   페이지 (계산기) </h2>");
		
		
	}

	

}
