package org.study.shop.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.study.shop.model.User;

@Repository
public class UserDAOImpl implements UserDAO {

	private static final String namespace = "org.study.mapper.UserMapper";
	
	@Autowired
	private SqlSession session;
	
	@Override
	public void create(User user) {
		session.insert(namespace + ".create", user);

	}

	@Override
	public void delete(User id) throws Exception {
		session.delete(namespace + ".delete", id);

	}
	
	@Override
	public List<User> listAll() throws Exception {
		return session.selectList(namespace + ".listAll");
		
	}
	
}
