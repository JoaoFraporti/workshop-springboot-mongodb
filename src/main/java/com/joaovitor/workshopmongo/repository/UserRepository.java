package com.joaovitor.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joaovitor.workshopmongo.domain.User;


public interface UserRepository extends MongoRepository<User, String>{

}
