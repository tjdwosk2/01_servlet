package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//인터페이스는 상수와 추상메서드만 가지고 있다 

public interface Command {
		// command01 , command02 , command03 모두 사용할 메서드
	// 자유롭게 왔다 갔다하기위해 
		public String exec(HttpServletRequest request, 
				HttpServletResponse response);

		
}
