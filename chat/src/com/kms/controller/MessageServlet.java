package com.kms.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sun.xml.internal.bind.v2.model.core.ID;

import sun.java2d.cmm.lcms.LCMS;

public class MessageServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		String msg = req.getParameter("msg");
		ServletContext application = getServletContext();
//		处理消息
//		获得消息的容器
		Object object = application.getAttribute("lms");
		List<String> lms = null;
		if(object==null) {
			lms = new ArrayList<String>();
			application.setAttribute("lms", lms);
		}else {
			lms = (List<String>) object;
		}
		lms.add(0, msg);//插入
		resp.getWriter().write("<script> window.history.go(-1) </script>");
	}
}
