package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex08")
public class Ex08 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//요청
		request.setCharacterEncoding("utf-8");
		//응답
		response.setContentType("text/html ; charset=utf-8");
		//화면
		PrintWriter out = response.getWriter();
		
		
		// 이름은 설정해두기!
		String name1 = request.getParameter("name");
		//일단 이름 뺴고 국어영어 수학은 바꿔준다 인티저 숫자로
        int kor1 = Integer.parseInt(request.getParameter("kor"));
        int eng1 = Integer.parseInt(request.getParameter("eng"));
        int math1 = Integer.parseInt(request.getParameter("math"));
        int result = 0;
        //총점 구해주기
        int sum = kor1 + eng1 + math1;
        double avg = (int)(sum / 3.0 * 10) / 10.0;
        String hak;

        if (avg >= 90) {
            hak = "A학점";
        }else if (avg >= 80) {
            hak = "B학점";
        }else if (avg >= 70) {
            hak = "C학점";
        }else if (avg >= 60) {
            hak = "D학점";
        }else {
            hak = "F학점";
        }
        out.println("<h2> 성적보기</h2>");
        out.println("<p> 이름 : " +name1+"</p>");
        out.println("<p> 국어 : " + kor1 +"</p>");
        out.println("<p> 영어 : " + eng1+"</p>");
        out.println("<p> 수학 : " + math1 +"</p>");
      
		
		
		
        
	
	
	}
	
	

}
