package com.kms.controller;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kms.dao.PersonDao;
import com.kms.pojo.Person;

public class AddPersonServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			String pname = req.getParameter("pnm");
			String ppsw = req.getParameter("pwd");
			Person persion = new Person(pname,ppsw); 
			PersonDao pd = new PersonDao();
			int i = pd.addPersion(persion);
			System.out.println(i);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
