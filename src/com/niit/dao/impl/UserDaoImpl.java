package com.niit.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import com.niit.dao.UserDao;
import com.niit.model.Users;

@Repository("userDao")
public class UserDaoImpl implements UserDao {
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void addUser(Users user) {
		sessionFactory.getCurrentSession().save(user);
	}

	@Override
	public boolean deleteUser(String id) {
		String hql="delete from Users where id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return query.executeUpdate()>0;
	}

	@Override
	public boolean modifyUser(Users user) {
		String hql="update users set username=?,birthday=? where id=?";
		Query query=sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, user.getUsername());
		query.setString(1, user.getBirthday());
		query.setInteger(2, user.getId());
		return query.executeUpdate()>0;
	}

	@Override
	public List<Users> getAll() {
		 String hql = "from Users";  
	     Query query = sessionFactory.getCurrentSession().createQuery(hql);  
	     return query.list();  
	}

	@Override
	public Users getUser(String id) {
		String hql="from users where id=?";
		Query query = sessionFactory.getCurrentSession().createQuery(hql);
		query.setString(0, id);
		return (Users) query.uniqueResult();
	}

}
