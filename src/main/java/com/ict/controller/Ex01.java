package com.ict.controller;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿 자바를 가지고 웹 페이지를 표현
//             즉, 자바에서 HTML , CSS , JavaScript 등을 표현해서
//				 웹 페이지로 만든다
//				main 메소드는 없다 .

@WebServlet("/Ex01")


public class Ex01 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Ex01() { super();  System.out.println("생성자" ); }


	public void init(ServletConfig config) throws ServletException {
		// 생성자와 마찬 가지로  멤버필드 초기화
		
		// init() 가 끝나면 자동으로 service() 메서드를 호출한다.
		// 메서드를 호출 하는 순서의 흐름을 잘파악 하기 
		
		System.out.println("init()" );
	}

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		// 서비스의 역할은 클라이언트가 정보를 요청할때 요청방식에 따라 알맞는 메소드를 호출하는 역할
		//  요청방식 :  - get 방식  : doGet() 호출 
		//					- post방식 :  doPost() 호출 
		
		// 	get 방식 (생략가능) : 정보를 http 패킷의 head에 담아서 보낸다.
		// 								  주소창에 해당 정보가 보인다.
		//								 속도는 빠르나  적은 양을 전달할때 
		//								 정보가 보이기 때문에 보안에 취약
		
		
		// post 방식 : 정보를 http body에 담아서 보낸다.
		// 				    주소창에서는 정보가 보이지 않는다.
		//					속도는 get 방식보다 느리다 . 많은 양을 전달 할때 사용 
		//					get 방식보다는 보안적이다.
		
		// request(요청) 		: 클라이언트에게 들어온 요청 정보를 가지고 있는 객체 
		// response(응답) 	: 클라이언트에게 결과를 보여줄 수 있는 응답 정보를 가지고 있는 객체
		System.out.println("service()" );
		
		// doGet()  , doPost() 에 보내야 된다. 이유 : 오버라이딩을 했으므로 
		//  클라이언트가 정보를 요청을 해야 뭔가를 한다 .
		// 서비스에서 어디로갈지 정해줘야한다 do post 로 갈지 doGet 을 갈지 알아야한다 그게 메서드
		
		
		if(request.getMethod().equalsIgnoreCase("get")) {
			doGet(request, response); // 요청 응답
			
		}else if (request.getMethod().equalsIgnoreCase("post")) {
			doPost(request, response); // 요청 응답 
		}
		
	}

	// post 방식일때는 doPost 에서 실제 일처리를 한다.
	// get 방식일떄는  doGet() 에서 실제 일처리를 한다.
	// 들어오는 정보는  get post 올지 모르니까 .  그래서 둘이 합쳐버림
	
	// 실제 일처리 한다는 뜻은 자바 코드로 HTML 문서를 만들수 있다 .
	//  다른 자바 클래스에서 정보를 전달하는 컨트롤러 역할을 할수 있다 
	
	
	// 일처리를 한곳에서 처리하기 위해서  위치값을 바꿔줬다  원래는  doGet 위에있고
	// doPost 가 밑에 있다 하지만 한번에 처리하기위해서  위치값을 바꿔줫다 
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("doPost()");
		
		// 일처리를 한곳에서 하기 위해서  보내버리고  요청 응답 
		doGet(request, response);
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doGet()");
		
		
//		//웹페이지에 글자쓰는것  
//		response.getWriter().append("Served at: ").append(request.getContextPath());
	} 


	//  해당 프로젝트가 톰켓에서 삭제 되기 직전에 실행되는 메서드
	
	public void destroy() {
			System.out.println("destory()");
	}

}
