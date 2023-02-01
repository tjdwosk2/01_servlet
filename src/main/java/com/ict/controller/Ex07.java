package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex07")
public class Ex07 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 요청에 따른 한글처리
		request.setCharacterEncoding("utf-8");

		// 응답에 따른 한글처리
		response.setContentType("text/html; charset=utf-8");

		// 화면에 출력
		PrintWriter out = response.getWriter();
		
		try {
			int su1 = Integer.parseInt(request.getParameter("s1"));
			int su2 = Integer.parseInt(request.getParameter("s2"));
			String op = request.getParameter("op");
			int result = 0;
			switch (op) {
			case "+": result = su1 + su2; break;
			case "-": result = su1 - su2; break;
			case "*": result = su1 * su2; break;
			case "/": result = su1 / su2 ; break;
			}
			out.println("<h2>결과 : " + su1 + op + su2 + "=" + result + "</h2>");
		} catch (Exception e) {
			out.println("<h2> 0으로는 나눌 수가 없습니다. </h2>");
		}
		
		/*
		 * int su1 = Integer.parseInt(request.getParameter("s1")); int su2 =
		 * Integer.parseInt(request.getParameter("s2")); String op =
		 * request.getParameter("op"); int result = 0; switch (op) { case "+": result =
		 * su1 + su2; break; case "-": result = su1 - su2; break; case "*": result = su1
		 * * su2; break; case "/": if (su2 != 0) { result = su1 / su2 ; break; }else {
		 * out.println("<h2> 결과 : 0으로 나눌 수 없습니다. </h2>"); } } if (su2 != 0) {
		 * out.println("<h2>결과 : " + su1 + op + su2 + "=" + result + "</h2>"); }
		 */
	}
}
