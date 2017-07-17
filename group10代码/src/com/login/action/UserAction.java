package com.login.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.login.dao.RoleDao;
import com.login.pojo.Role;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import freemarker.template.utility.Execute;

public class UserAction extends ActionSupport implements ModelDriven<Role>{
	private String username;
	private String password;
	private String securityCode;
	private String prePage;
	HttpSession session = ServletActionContext.getRequest().getSession();
    String checkCode = (String)session.getAttribute("checkCode");
	@Override
	public String execute() throws Exception {
		List<Role> lrs= new ArrayList<Role>();
		RoleDao roleDao= new RoleDao();
		if(checkCode.equals(securityCode)){
		lrs=roleDao.lrs();
		for(int i=0;i<lrs.size();i++)
		{	
			Role role=lrs.get(i);
			if(role.getUsername().equals(this.username)&&role.getPassword().equals(this.password)) {
				ActionContext ctx = ActionContext.getContext();  
	            Map<String, Object> session = ctx.getSession();  
	              
	            //保存用户信息session  
	            session.put("user",role.getUsername());  
	  
	            // 获取跳转到登陆界面之前的页面地址，由拦截器提供  
	            prePage = (String) session.get("prePage");  
	  
	            // 清除session中的数据  
	            System.out.println(prePage);
	            session.remove("prePage");  
	  
	            if (null == prePage) {  
	                return "index";// 不是拦截器跳转到登陆页面的，直接访问的登陆页面  
	            } else {  
	                return SUCCESS;// 是拦截器跳转到登陆登录前页面  
	            }  
			}
		}
		return "error";
		}
		return "imgerror";
	}
	public String getPrePage() {
		return prePage;
	}
	public void setPrePage(String prePage) {
		this.prePage = prePage;
	}
	public String getSecurityCode() {
		return securityCode;
	}
	public void setSecurityCode(String securityCode) {
		this.securityCode = securityCode;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public Role getModel() {
		// TODO Auto-generated method stub
		return null;
		
	}
}