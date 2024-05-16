package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import service.impl.MemberServiceImpl;

public class UpdateMemberController extends ActionSupport{
	private Integer id;
	private String name;
	private String password;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private static ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
	public String execute() throws Exception
	{
		MemberServiceImpl ms=(MemberServiceImpl) a.getBean("memberServiceImpl");
		ms.update(getId(), getName(), getPassword());
		return "updateSuccess";
	}

}
