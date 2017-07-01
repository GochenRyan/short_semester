package com.kms.servlet;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kms.dao.PersiondDao;
import com.kms.pojo.Persion;

public class AddPersionServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)  {
		try {
			req.setCharacterEncoding("UTF-8");
			resp.setCharacterEncoding("UTF-8");
			String pid = req.getParameter("pid");
			String pnm = req.getParameter("pnm");
			String pwd = req.getParameter("pwd");
			String bdate = req.getParameter("bdate");
			String rid = req.getParameter("rid");
			String mgid = req.getParameter("mgid");
			String icon = req.getParameter("icon");
			Persion persion = new Persion(pid,pnm,pwd,bdate,rid,mgid,icon); 
			PersiondDao pd = new PersiondDao();
			int i = pd.addPersion(persion);
			System.out.println(i);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 	}
}
