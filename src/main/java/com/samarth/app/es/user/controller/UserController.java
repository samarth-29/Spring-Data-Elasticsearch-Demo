package com.samarth.app.es.user.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.samarth.app.es.user.dao.UserDAO;
import com.samarth.app.es.user.model.User;

@RestController
public class UserController {
	
	private final Logger LOG = LoggerFactory.getLogger(getClass());
	 
	@Autowired
	private UserDAO userDAO;
	    
	 
	@RequestMapping("/all")
    public List<User> getAllUsers() {
        return userDAO.getAllUsers();
    }
	
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public User addUsers(@RequestBody User user) {
	    userDAO.addNewUser(user);
	    return user;
	}

}
