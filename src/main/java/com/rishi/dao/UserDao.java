package com.rishi.dao;

import com.rishi.model.User;

public interface UserDao {

	User findById(int id);
	
	User findBySSO(String sso);
	
}

