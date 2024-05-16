package service;

import entity.Member;

public interface MemberService {
	//create
	void add(Member m);
	
	//read-->UI
	String selectAll();
	//update
	void update(int id,String name,String password);
	//delete
	void delete(int id);

}
