package com.ex.userapp.model;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Repository;

import com.ex.userapp.beans.User;
import com.ex.userapp.entities.UserEntitry;
import com.ex.userapp.utilities.DBUtility;

@Repository
public class UserModel {

	public void saveUser(User user) {
		System.out.println(user);
		SessionFactory sf = DBUtility.getSF();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		UserEntitry entity = new UserEntitry();
		BeanUtils.copyProperties(user, entity);
		session.save(entity);
		tx.commit();
	}

	public List<UserEntitry> getAllUsers() {
		SessionFactory sf = DBUtility.getSF();
		Session session = sf.openSession();
		Query query = session.createQuery("from UserEntitry");
		List<UserEntitry> list = query.getResultList();
		return list;
	}
}
