package com.ict.model;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command03  implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		String msg = "";
		
		int su1 = Integer.parseInt(request.getParameter("s1"));
		int su2 = Integer.parseInt(request.getParameter("s2"));
		
		String  op = request.getParameter("op");
		
		try {
			int result = 0;
			switch (op) {
			case "+": result= su1+su2 ;break;
			case "-": result= su1-su2 ;break;
			case "*": result= su1*su2 ;break;
			case "/": result= su1/su2 ;break;

			}
			msg = su1 + su2+ "=" +result ;
			
		} catch (Exception e) {
			 msg = "0으로는 나눌수 없습니다 ";
		}
		
		
		return msg;
	}
	
	

}
