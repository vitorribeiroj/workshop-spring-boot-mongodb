package com.vitorribeiroj.workshopmongo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vitorribeiroj.workshopmongo.domain.User;

@Repository
public interface UserRepository extends MongoRepository<User, String>{

	

}
