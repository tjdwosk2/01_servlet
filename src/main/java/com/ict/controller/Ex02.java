package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ict01")
public class Ex02 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	 // do Post  ,     doGet 흐름도 파악 하기 
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// doGet 으로 간다 요청 하고 응답 .
		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		//  서블릿  : 자바 코드의 HTML,CSS,JavaScript  를 섞어서 사용
		//  JSP      : HTML , CSS, JavaScript 에서 자바코드를 섞어서 사용
		// 실행을 하면 응답이다 요청에 대한 response (응답)
		
		
		
		//  응답에 대한 한글 처리
		// ContentType = > 해당 문서 타입을 말한다   이문자는 글자로 되어있고 html1 로 되어있고 문자는 utf - 8 로 처리해라 톰켓한테 알려주면 
		//							이문서를 먼저 읽어버린다 그리고 그방식대로 처리한다  utf-8 (전세계 글자 표시) 
		// 응답! 타입을 바꾸자 텍스트 html 을  utf-8 로 그래야 우리가 알수 있으니까!
		
		
		response.setContentType("text/html; charset=utf-8");
		
		// 화면(브라우저 = 웹페이지) 에 출력하기 위한 설정 //응답에 대한결과 
		PrintWriter out = response.getWriter();

		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset='UTF-8'>");
		out.println("<title>제목 태그 : h1 ~ h6</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h0 style='background-color: red;'> 제목 태그 h0 </h0>");
		out.println("<h0> 제목 태그 h0 </h0>");
		out.println("<h1 style='background-color: blue;'> 제목 태그 h1 </h1>");
		out.println("<h2> 제목 태그 h2 </h2>");
		out.println("<h3> 제목 태그 h3 </h3>");
		out.println("<h4> 제목 태그 h4 </h4>");
		out.println("<h5> 제목 태그 h5 </h5>");
		out.println("<h6> 제목 태그 h6 </h6>");
		out.println("<h7> 제목 태그 h7 </h7>");
		out.println("<hr>");
		out.println("<h1> 제목 태그 h1 </h1>");
		out.println("<h1 style='font-size: 48px'> 제목 태그 h1 </h1>");
		out.println("<hr>");
		out.println("<span style='background-color: yellow;'>HTML & CSS</span>");
		out.println("<span>JavaScript</span>");
		out.println("</body>");
		out.println("</html>");

	}

}