package com.aniruddha.scloud.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniruddha.scloud.model.User;
import com.aniruddha.scloud.service.UserService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/apis")
public class UserController {

	@Autowired
	private UserService userService;

	private static Log log = LogFactory.getLog(UserController.class);
	
	@GetMapping("/users/list")
	@ApiOperation("Rest API to fetch the list of Users")
	public ResponseEntity<List<User>> getUserDetails() {
		log.info("Entered User Controller");
		
		return userService.getUserDetails();
	}
}
