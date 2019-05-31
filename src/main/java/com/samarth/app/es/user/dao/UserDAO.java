package com.samarth.app.es.user.dao;

import java.util.List;

import com.samarth.app.es.user.model.User;

public interface UserDAO {
	
	List<User> getAllUsers();
    User addNewUser(User user);

}
