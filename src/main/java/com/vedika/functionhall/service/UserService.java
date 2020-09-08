package com.vedika.functionhall.service;

import com.vedika.functionhall.model.User;

public interface UserService {
	
	User register(User user);
	User findUserByMobilenumber(String mobilenumber);
	

}