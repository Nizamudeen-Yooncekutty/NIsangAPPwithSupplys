package com.nisangapp.nisangapp.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nisangapp.nisangapp.model.Supply;

public interface SupplyRepository extends MongoRepository<Supply, Long>{

}
