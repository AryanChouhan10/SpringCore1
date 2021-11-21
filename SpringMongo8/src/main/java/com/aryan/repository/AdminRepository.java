package com.aryan.repository;



import org.springframework.data.mongodb.repository.MongoRepository;

import com.aryan.model.Admin;


public interface AdminRepository extends MongoRepository<Admin,Integer> {

}
