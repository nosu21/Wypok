package com.tomcio.wypok.service;

import com.tomcio.wypok.dao.DAOFactory;
import com.tomcio.wypok.dao.UserDAO;
import com.tomcio.wypok.data.User;

public class UserService {
	
	public void addUser(String username, String email, String password) {
	        User user = new User();
	        user.setUsername(username);
	        user.setPassword(password);
	        user.setEmail(email);
	        user.setActive(true);
	        DAOFactory factory = DAOFactory.getDAOFactory();
	        UserDAO userDao = factory.getUserDAO();
	        userDao.create(user);
	    }
	  public User getUserById(long userId) {
	        DAOFactory factory = DAOFactory.getDAOFactory();
	        UserDAO userDao = factory.getUserDAO();
	        User user = userDao.read(userId);
	        return user;
	    }
	     
	    public User getUserByUsername(String username) {
	        DAOFactory factory = DAOFactory.getDAOFactory();
	        UserDAO userDao = factory.getUserDAO();
	        User user = userDao.getUserByUsername(username);
	        return user;
	    }

}
