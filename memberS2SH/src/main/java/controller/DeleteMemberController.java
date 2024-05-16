package controller;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.opensymphony.xwork2.ActionSupport;

import service.impl.MemberServiceImpl;

public class DeleteMemberController extends ActionSupport{
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	private static ApplicationContext a=new ClassPathXmlApplicationContext("applicationContext.xml");
	public String execute() throws Exception
	{
		MemberServiceImpl ms=(MemberServiceImpl) a.getBean("memberServiceImpl");
		ms.delete(getId());
		
		return "deleteSuccess";
	}

}
