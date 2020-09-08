package com.vedika.functionhall.repository;



import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.vedika.functionhall.model.User;

public interface UserRepository extends MongoRepository<User, String> {

	User save(User user);

	@Query(value = "{'user.mobileNumber' : ?0}", fields = "{'user.mobileNumber':1}")
	public User findUserByMobilenumber(String mobilenumber);

}
