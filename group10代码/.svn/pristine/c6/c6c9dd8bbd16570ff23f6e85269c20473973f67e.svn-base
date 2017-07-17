package com.login.action;

import java.io.ByteArrayInputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.login.img.SecurityCode;
import com.login.img.SecurityImage;
import com.opensymphony.xwork2.ActionSupport;

public class ValidCodeAction extends ActionSupport {
	private ByteArrayInputStream imageStream;  
	@Override
	public String execute() throws Exception {
		try {  
			HttpServletRequest request = ServletActionContext.getRequest();  
			String securityCode = SecurityCode.getSecurityCode();  
			HttpSession session = ServletActionContext.getRequest().getSession();
	        session.setAttribute("checkCode", securityCode);
			imageStream = SecurityImage.getImageAsInputStream(securityCode);  
			// 放入session中  
			// session.put("securityCode", securityCode);   
			request.getSession().setAttribute("securityCode", securityCode);  
		} catch (Exception e) {  
			e.printStackTrace();  
		}  
		return SUCCESS;
	}
	public ByteArrayInputStream getImageStream() {  
		return imageStream;  
	}  

	public void setImageStream(ByteArrayInputStream imageStream) {  
		this.imageStream = imageStream;  
	}  
}
