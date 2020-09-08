package com.vedika.functionhall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vedika.functionhall.model.User;
import com.vedika.functionhall.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public User register(User user) {
		// TODO Auto-generated method stub
		return userRepository.save(user);
	}

	@Override
	public User findUserByMobilenumber(String mobilenumber) {
		// TODO Auto-generated method stub
		return userRepository.findUserByMobilenumber(mobilenumber);
	}
	

}

