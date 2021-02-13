package com.aniruddha.scloud.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniruddha.scloud.model.request.AddUserRequest;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/apis")
public class UserManagementController {
	
	private static Log log = LogFactory.getLog(UserManagementController.class);
	@PostMapping("/users/onboard")
	@ApiOperation("REST Api to add a User")
	public String addUser(@RequestBody AddUserRequest addUserRequest) {
		log.info("Entered Add User Controller");
		return null;
	}
}
