package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex12_1")
public class Ex12_1 extends HttpServlet {
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
		
		
		Calendar now = Calendar.getInstance();
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONDAY)+1;
		int day = now.get(Calendar.DATE);
		
		
		out.println("<h2>Ex12_1   페이지 (오늘 날짜 구하기) </h2>");
		out.println("<h3>" +year +"." + month + "." + day +"</h3>");
		
		
	}

	

}
