package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex13")
public class Ex13 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html; charset utf-8");

		PrintWriter out = response.getWriter();

		// 하나의 서블릿에서 여러가지 요청을 받아 처리 하자.
		// 많은양의 일처리를 하므로 단점들이 생긴다 .
		// 이러한 단점을 해결하기 위해서 별도의 일처리하는 자바클래스를 만들어 호출

		String cmd = request.getParameter("cmd");

		switch (cmd) {
		case "1":
				out.println("<h2>오늘날짜 구하기 </h2>");
				Calendar now = Calendar.getInstance();
				int year = now.get(Calendar.YEAR);
				int moth = now.get(Calendar.MONTH)+1;
				int day = now.get(Calendar.DATE);
				
				out.println("<h3>" + year +"." + moth +"."+day+"입니다. </h3>");
			break;
		case "2":
			out.println("<h2>운세 구하기 </h2>");
			int lucky = (int)(Math.random()*101);
			out.println("<h3> 운세는" +lucky +"% 입니다. </h3>");
			break;
		case "3":
			out.println("<h2> 계산기 </h2>");
			try {
				int su1 = Integer.parseInt(request.getParameter("s1"));
				int su2 = Integer.parseInt(request.getParameter("s2"));
				String op =request.getParameter("op");
				
				int result = 0;
				switch (op) {
				case "+":result = su1+su2; break;
				case "-":result = su1-su2; break;
				case "*":result = su1*su2; break;
				case "/":result = su1/su2; break;
				}
				out.println("<h2>" + su1+op+su2+"="+result+"</h2");
				
			} catch (Exception e) {
				out.println("<h3> 0으로는 나눌수 없습니다</h3> ");
			}
			break;

		}

	}

}
