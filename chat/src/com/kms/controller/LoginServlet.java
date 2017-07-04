package com.kms.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.kms.dao.PersonDao;
import com.kms.pojo.Person;

public class LoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");
		resp.setCharacterEncoding("UTF-8");
		String name = req.getParameter("nm");
		String pwd = req.getParameter("pwd");
		Person person = new Person(name,pwd);
		PersonDao rd = new PersonDao();
		List<Person> lrs = rd.lrs();
		int label_1 = 0;
		for(int i = 0 ;i < lrs.size();i++) {
			if((lrs.get(i).getName()).equals(name) && (lrs.get(i).getPsw()).equals(pwd)) {
				label_1=1;
			}
		}
		if(label_1==1) {
			HttpSession httpSession = req.getSession();
			httpSession.setAttribute("person",person);
			httpSession.setMaxInactiveInterval(10);
			resp.sendRedirect("index.jsp");
			
		}else {
			PrintWriter out = resp.getWriter();
			out.print("<script> alert('error') </script>");
			out.print("<script> history.go(-1) </script>");
		}
	}
}
