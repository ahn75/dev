package org.study.shop.dao;

import java.util.List;
import org.study.shop.model.User;

public interface UserDAO {
	
	public void create(User user) throws Exception;

	public void delete(User id) throws Exception;
		
	public List<User> listAll() throws Exception;

}

