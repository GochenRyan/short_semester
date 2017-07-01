package com.work1;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.jmx.snmp.Timestamp;
import com.sun.org.apache.bcel.internal.generic.NEW;

import javafx.util.converter.PercentageStringConverter;

public class HelloWorldServlet extends HttpServlet{
	private int times;
	private int age1;
	private int age2;
	private int age3;
	@Override
	public void init() throws ServletException {
		times = Integer.valueOf( getInitParameter("times"));
		age1 = Integer.valueOf(getInitParameter("Bob"));
		age2 = Integer.valueOf(getInitParameter("Peter"));
		age3 = Integer.valueOf(getInitParameter("King"));
	}
	@Override
	protected void doGet(HttpServletRequest req,
			HttpServletResponse resp)throws SecurityException,IOException{
		req.setCharacterEncoding("UTF-8");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		out.print("Bob: "+age1+"</br>");
		out.print("Peter: "+age2+"</br>");
		out.print("King: "+age3+"</br>");
		times++;
		out.print("您是第"+times+"位来本网站的");	
	}
	
}
