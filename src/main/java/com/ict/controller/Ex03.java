package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 웹서블렛 맵핑 로그
@WebServlet("/Ex03")
public class Ex03 extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
        // 응답 한글 처리
    	request.setCharacterEncoding("utf-8");
        response.setContentType("text/html; charset=utf-8");
        PrintWriter out = response.getWriter();
        
        
        // 오늘 운수
        // 오늘 날짜 구하기
        Calendar now = Calendar.getInstance();
        int year = now.get(Calendar.YEAR);//년
        int month = now.get(Calendar.MONTH) + 1;// 0부터 11일 그래서 1월추가
        int day = now.get(Calendar.DATE); //일
        int lucky = (int) (Math.random() * 101); //운

        out.print("<h2>" + year + ". " + month + ". " + day + ". 의 운수는 " + lucky + "% 입니다.");
        out.print("<hr>");
        out.print("<h2> 요청 정보 출력 </h2>");
        out.print("<ul>");
        out.print("<li> 요청주소 : " + request.getRemoteAddr()+"</li>" );
        out.print("<li> 요청주소 : " + request.getRemoteHost()+"</li>" );
        out.print("<li> 요청포트 : " + request.getRemotePort()+"</li>" );
        out.print("<li> 요청사용자 : " + request.getRemoteUser()+"</li>" );
        out.print("<li> 프로젝트주소 : " + request.getContextPath()+"</li>" );
        out.print("<li> 파일주소 : " + request.getRequestURI()+"</li>" );
        out.print("<ul>");
    }

}