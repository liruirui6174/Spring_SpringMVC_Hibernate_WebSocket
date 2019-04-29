package com.lirui.dao.Impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lirui.dao.IDao;
import com.lirui.model.TestModel;


@Repository
public class DaoImpl implements IDao {

	
	@Autowired
	private SessionFactory sessionFactory;
	@Override
	public String testDao() {
		return "Dao";
	}
	@Override
	public TestModel getTest() {
		Session session =  sessionFactory.getCurrentSession();
		String hql = "from TestModel";
		Query query =session.createQuery(hql);
		return (TestModel) query.list().get(0);
	}
	@Override
	public void saveTest(TestModel tm) {
		Session session =  sessionFactory.getCurrentSession();
		session.save(tm);
		
	}

}
