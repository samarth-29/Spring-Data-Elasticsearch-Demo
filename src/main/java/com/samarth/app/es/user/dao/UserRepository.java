package com.samarth.app.es.user.dao;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import com.samarth.app.es.user.model.User;

@Repository
public interface UserRepository extends ElasticsearchRepository<User, String> {

}
