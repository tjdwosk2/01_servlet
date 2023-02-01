package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ict.model.Command;
import com.ict.model.Command01;
import com.ict.model.Command02;
import com.ict.model.Command03;

@WebServlet("/Ex14")
public class Ex14 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		request.setCharacterEncoding("utf-8");

		response.setContentType("text/html; charset utf-8");

		PrintWriter out = response.getWriter();
		
		
		String cmd = request.getParameter("cmd");
		
		// jsp 주소로 오기떄문에 String 으로 받는다
		
		Command comm = null;
		
		switch (cmd) {
		case "1": comm = new Command01(); break;
		case "2":comm = new  Command02(); break;
		case "3":comm = new  Command03(); break;

		}
			String msg = comm.exec(request, response);
			out.println("<h2> 결과 보기 </h2>");
			out.println("<h3>" + msg + "</h3>");
			
			//나중에는 jsp 페이지로 이동하게 만든다.(페이지 이동을 이용해서 (리다이렉트,포워딩)
			
			
		
	}

	

}
