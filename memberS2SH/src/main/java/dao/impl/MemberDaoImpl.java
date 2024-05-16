package dao.impl;
import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import dao.DbConnection;
import dao.MemberDao;
import entity.Member;

public class MemberDaoImpl implements MemberDao{

	public static void main(String[] args) {
		Member m=new MemberDaoImpl().selectById(2);
		
		new MemberDaoImpl().deleteById(m);
	}
	private static Session session=DbConnection.getDb();
	private static Transaction t=session.beginTransaction();
	
	@Override
	public void add(Member m) {
		 //Session session=DbConnection.getDb();
		 //Transaction t=session.beginTransaction();
		session.save(m);
		t.commit();
		
	}

	@Override
	public List<Member> selectAll() {
		 //Session session=DbConnection.getDb();
		
		String SQL="select * from member";
		Query q=session.createNativeQuery(SQL, Member.class);
		return q.getResultList();
	}

	@Override
	public Member selectById(int id) {
		 //Session session=DbConnection.getDb();
		
		return session.find(Member.class, id);
	}

	@Override
	public void update(Member m) {
		//Session session=DbConnection.getDb();
		//Transaction t=session.beginTransaction();
		session.update(m);
		t.commit();
	}

	@Override
	public void deleteById(Member m) {
		//Session session=DbConnection.getDb();
		//Transaction t=session.beginTransaction();
		session.delete(m);
		t.commit();
	}

}