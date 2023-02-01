package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex11")
public class Ex11 extends HttpServlet {
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
		
		//페이지 이동  ( ,포워딩)
		
		// = > 현재 페이지에서 작업 한 후  다픈 페이지로 이동 (현재 페이지는 보이지 않는다.)
		// 포워딩 : 다른 페이지로 이동 하면 기존에 request와 response를  그대로 가져간다 .
		// 			즉 파라미터값들이 보존된다
		//			 주소창에는 최초 주수가 보인다.
		// 사용법 : request.getRequestDispatcher("이동할 주소") .forword(request,response)
		

		
		String name = request.getParameter("name");
		String age = request.getParameter("age");
		
		out.println("<h2> Ex11 페이지입니다.</h2>");
		out.println("<h3><ul>");
		out.println("<li> 이름 :" + name + "<li>");
		out.println("<li> 나이 :" + age + "<li>");
		out.println("</ul></h3>");
		
		request.getRequestDispatcher("/Ex11_2").forward(request, response);
		
		
		
	}

	

}
