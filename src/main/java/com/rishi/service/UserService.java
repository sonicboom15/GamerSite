package com.rishi.service;

import com.rishi.model.User;

public interface UserService {

	User findById(int id);
	
	User findBySso(String sso);
	
}