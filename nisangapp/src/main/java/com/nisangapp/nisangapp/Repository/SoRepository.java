package com.nisangapp.nisangapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.nisangapp.nisangapp.model.So;
@Repository
public interface SoRepository extends MongoRepository<So, Long>{

}
