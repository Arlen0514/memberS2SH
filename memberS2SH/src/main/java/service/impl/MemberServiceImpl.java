package service.impl;



import java.util.List;

import dao.impl.MemberDaoImpl;
import entity.Member;
import service.MemberService;

public class MemberServiceImpl implements MemberService{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	private static MemberDaoImpl mdi=new MemberDaoImpl();

	@Override
	public void add(Member m) {
		mdi.add(m);
		
	}

	@Override
	public String selectAll() {
		String show=" ";
		List<Member> l=mdi.selectAll();
		for(Member m:l)
		{
			show=show+"<tr><td>"+m.getId()
			+"<td>"+m.getName()
			+ "<td>"+m.getUsername()
			+ "<td>"+m.getPassword();
		}
		return show;
	}

	@Override
	public void update(int id, String name, String password) {
		Member m=mdi.selectById(id);
		m.setName(name);
		m.setPassword(password);
		
		mdi.update(m);
		
	}

	@Override
	public void delete(int id) {
		Member m=mdi.selectById(id);
		mdi.deleteById(m);
		
	}

}
