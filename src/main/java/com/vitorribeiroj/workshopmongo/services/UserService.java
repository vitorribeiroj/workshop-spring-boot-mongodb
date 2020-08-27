package com.vitorribeiroj.workshopmongo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.vitorribeiroj.workshopmongo.domain.User;
import com.vitorribeiroj.workshopmongo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return ((MongoRepository<User, String>) repo).findAll();
	}
	
}
