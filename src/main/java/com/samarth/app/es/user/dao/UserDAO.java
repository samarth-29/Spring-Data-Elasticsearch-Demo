package com.samarth.app.es.user.dao;

import java.util.List;

import com.samarth.app.es.user.model.User;

public interface UserDAO {
	
	List<User> getAllUsers();
    User getUserById(String userId);
    User addNewUser(User user);
    Object getAllUserSettings(String userId);
    String getUserSetting(String userId, String key);
    String addUserSetting(String userId, String key, String value);

}
