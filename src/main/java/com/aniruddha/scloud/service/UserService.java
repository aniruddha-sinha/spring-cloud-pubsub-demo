package com.aniruddha.scloud.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.aniruddha.scloud.dao.UserDao;
import com.aniruddha.scloud.model.User;

@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	private static Log log = LogFactory.getLog(UserService.class);
	
	public ResponseEntity<List<User>> getUserDetails() {
		log.debug("Entered User Service");
		return userDao.getUserDetails();
	}
}
