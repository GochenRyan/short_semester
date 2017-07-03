package com.kms.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kms.dao.RoleDao;
import com.kms.pojo.Role;
import java.util.List;

public class ListRoleServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setCharacterEncoding("utf-8");
		
		RoleDao rd = new RoleDao();
		List<Role> lrs = rd.lrs();
		req.setAttribute("lrs", lrs);
		req.getRequestDispatcher("/lr.jsp").forward(req, resp);
	}
}
