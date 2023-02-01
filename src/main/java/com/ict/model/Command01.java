package com.ict.model;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Command01  implements Command{

	@Override
	public String exec(HttpServletRequest request, HttpServletResponse response) {
		
		String msg = "";
		Calendar now = Calendar.getInstance();
		int year =now.get(Calendar.YEAR);
		int moth =now.get(Calendar.MONTH)+1;
		int day = now.get(Calendar.DATE);
		
		msg= year +"."+moth+"."+day;
		
		
		return msg;
	}
	
	

}
