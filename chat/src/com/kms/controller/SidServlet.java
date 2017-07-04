package com.kms.controller;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.jasper.tagplugins.jstl.core.ForEach;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class SidServlet extends HttpServlet{
	public final static char[] cs = new char[] { '1', '2', '3', '4', '5', '6', '7', '8', '9', '0' };
	private final static Random random = new Random();

	private String sid() {
		String string = "";
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < 4; i++) {
			sb.append(cs[random.nextInt(cs.length)]);
		}
		string = sb.toString();
		return string;
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//产生随机验证码
		String sid = sid();
		//在session中保存验证码
		HttpSession session = req.getSession();
		session.setAttribute("sid", sid);
		session.setMaxInactiveInterval(30);
		//生成验证码图片
		BufferedImage bi = new BufferedImage(68, 22, BufferedImage.TYPE_INT_BGR);//创建图像
		Graphics g = bi.getGraphics();//通过缓冲区创建一个画布
		g.drawString(sid, 0, 20);
		ImageIO.write(bi, "JPG", resp.getOutputStream());
	}
}