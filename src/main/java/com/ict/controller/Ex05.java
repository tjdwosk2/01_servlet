package com.ict.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Ex05")
public class Ex05 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		// 서블릿의 역할은 클라이언트에서 요청한 것을 받아서
		// 요청에 맞은 일 처리를 하는 곳으로 전달하고
		// 해당 일 처리의 결과를 받아서 클라이언트에게 응답하는 역할을한다.
		// 이러한 역할을 컨트롤러라고 하며 MVC에서 C 에 해당한다.

		// 3가지 는 무조건 써주기

		// 요청에 따른 한글처리
		response.setCharacterEncoding("utf-8");

		// 응답에 따른 한글처리
		response.setContentType("text/html ; charset=utf-8 ");

		// 화면에 출력 (브라우저 출력)
		PrintWriter out = response.getWriter();

		// 클라이언트가 서버에게 정보를 요청하면서 필요한 정보를 보낼 수 있다 .
		// 이러한 요청을 처리하기 위해서 함께 전달되는 정보를 파라미터 라고 한다 .

		// 파라미터의 자료형은 기본적으로 String 이거나 String[] 이다 배열
		// get 방식 : 주소창에 정보가 보인다.(?name=value&name=value...)
		// post 방식 : 주소창에 파라미터 정보가 보이지 않는다 .

		// 파라미터를 받아서 처리하는 메서드들
	    // 1. request.getParameter("name"):String
        //       name을 호출하면 value값이 나온다
        //       해당 name에 매칭된 value 추출
		
        // 2. request.getParameterValues("name"):String[]
        // 3. request.getParameterMap():Map<String,String[]>
        //       맵 형식의 파라미터를 받을 때 사용
        // 4. request.getParameterNames():Enumeration<String>
        //    열거형의 파라미터를 받을 때 사용
		
		
		
		// 만약에 (name)과 나이(age) 가 파라미터값으로 넘어왔을때 처리하는 방법 
		out.println("<h2>서블릿 파라미터 예제</h2>");
		 String name = request.getParameter("name");
		 String age = request.getParameter("age");
		 
		 
		 out.println("<h3>");
		 out.println("<p>이름 : " + name +"</p>");
		 out.println("<p>나이 : " + age + "</p>");
		 out.println("</h3>");
		 
		 // 만약에 s1, s2, op 라는 파라미터 값이 넘어온다고 가정하자
		 // s1 , s2 는 문자형 숫자  이며 op는(+,-,*,/) 이라고 가정하자
		 // s1=7&s2=3&op=+ 일때 처리하는 계산기를 만들자 
		 
		 String  s1 = request.getParameter("s1");
		 String  s2 = request.getParameter("s2");
		 String  op = request.getParameter("op");
		 
		 
		 //바꿔주기 숫자로
		 int su1 = Integer.parseInt(s1);
		  int su2 = Integer.parseInt(s2);
		 
		 // 이것도 바꿔주는값 
		// int su1 = Integer.parseInt(request.getParameter("s1")); 
		// int su2 = Integer.parseInt(request.getParameter("s2")); 
		 
		  // result 값을 0을 주고 op 를 switch 문을돌려서 값을 넣어준다 op(값)
		 int result = 0;
		 
		 switch (op) {
		case "+" :result =su1+su2; break;
		case "-" :result =su1-su2; break;
		case "*" :result =su1*su2; break;
		case "/" :result =su1/su2; break;
			
		
		}
		 out.println("<h3>");
		 out.println("<p>결과는 :" +su1 + op+su2 + "=" +result+"</p>");
		 out.println("</h3>");
		 
		
		

	}

}
