package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex06")

public class Ex06 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {


		
		// 요청에 따른 한글처리W
		request.setCharacterEncoding("utf-8");

		// 응답에 따른 한글처리
		response.setContentType("text/html ; utf-8");
		// 화면에 출력
		PrintWriter out = response.getWriter();
		
		// 요청에대한 파라미터값을 이름을 지정하겟다
		String name = request.getParameter("name");
		
		// 요청에대한 파라미터값을 나이을 지정하겟다
		String age = request.getParameter("age");
		
		// h2 설정해서 이름 설명해주고 
		out.println("<h2> 여기는 서블릿 Ex06 페이지 입니다 .</h2>");
		// h3 안에 들어가야하기때문에 p태그 해서 이름과 나이를  더해준다!  태그랑
		out.println("<h3>");
		out.println("<p>이름 :" + name +"</p>");
		out.println("<p>나이 :" + age +"</p>");
		out.println("</h3>");
		
		
		


	}

}
