package dao;

import java.util.List;

import entity.Member;

public interface MemberDao {
	//create
	void add(Member m);
	
	//read
	List<Member> selectAll();
	Member selectById(int id);
	
	//update
	void update(Member m);
	
	//delete
	void deleteById(Member m);

}