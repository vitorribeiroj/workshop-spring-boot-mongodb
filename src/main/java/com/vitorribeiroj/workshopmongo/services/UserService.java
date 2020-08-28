package com.vitorribeiroj.workshopmongo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.vitorribeiroj.workshopmongo.domain.User;
import com.vitorribeiroj.workshopmongo.repository.UserRepository;
import com.vitorribeiroj.workshopmongo.services.exception.ObjectNotFoundException;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repo;
	
	public List<User> findAll() {
		return ((MongoRepository<User, String>) repo).findAll();
	}
	
	public User findById(String id) {
		
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
		
	}
	
}
