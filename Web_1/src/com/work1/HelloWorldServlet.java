package com.work1;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class HelloWorldServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws SecurityException,IOException{
		System.out.println(System.currentTimeMillis());
	}
}
