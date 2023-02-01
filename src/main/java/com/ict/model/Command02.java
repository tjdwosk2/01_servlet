package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command02  implements Command {

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		
		String msg = "";
		
		int lucky = (int)(Math.random()*101);
		msg = "당신의 운세는" + lucky + "%입니다";
		
		
		
		return msg;
	}
			
	
	
}
