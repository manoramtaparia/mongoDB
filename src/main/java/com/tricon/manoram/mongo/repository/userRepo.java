package com.tricon.manoram.mongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import com.tricon.manoram.mongo.model.Users;

@Repository
public interface userRepo extends MongoRepository<Users,String> {

}