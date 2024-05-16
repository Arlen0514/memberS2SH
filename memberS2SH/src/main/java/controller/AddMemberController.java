package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import entity.Member;
import service.impl.MemberServiceImpl;

public class AddMemberController extends ActionSupport{
	private String name;
	private String username;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String execute() throws Exception
	{
		MemberServiceImpl ms=(MemberServiceImpl) a1.getBean("memberServiceImpl");
		
		ms.add(new Member(getName(),getUsername(),getPassword()));
		
		
		return "addSuccess";
	}
	
	private static ApplicationContext a1=new ClassPathXmlApplicationContext("applicationContext.xml");
}