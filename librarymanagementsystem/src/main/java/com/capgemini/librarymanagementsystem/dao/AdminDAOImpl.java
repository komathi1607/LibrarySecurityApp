package com.capgemini.librarymanagementsystem.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;
import javax.persistence.TypedQuery;
import org.springframework.stereotype.Repository;
import com.capgemini.librarymanagementsystem.dao.AdminDAO;
import com.capgemini.librarymanagementsystem.dto.UserInfoBean;

@Repository
public class AdminDAOImpl implements AdminDAO {

	@PersistenceUnit
	private EntityManagerFactory factory;

	@Override
	public UserInfoBean getUser(String username) {
		String jpql = "select u from UserInfoBean u where u.username=:email";
		EntityManager manager = factory.createEntityManager();
		TypedQuery<UserInfoBean> query = manager.createQuery(jpql, UserInfoBean.class);
		query.setParameter("email", username);
		return query.getSingleResult();
	}
}
