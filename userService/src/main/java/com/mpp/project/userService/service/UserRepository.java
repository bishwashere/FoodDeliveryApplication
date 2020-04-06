package com.mpp.project.userService.service;

import com.mpp.project.userService.Exception.UserNotFoundException;
import com.mpp.project.userService.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User, String> {
	
	User findByUsernameAndPassword(String un, String psw);
	User findByUsername(String username) throws UserNotFoundException;

}
