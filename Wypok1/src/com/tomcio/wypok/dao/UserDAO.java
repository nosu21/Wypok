package com.tomcio.wypok.dao;

import java.util.List;

import com.tomcio.wypok.data.User;

public interface UserDAO extends GenericDAO<User, Long> {
	
	 List<User> getAll();
	 User getUserByUsername(String username);

}
