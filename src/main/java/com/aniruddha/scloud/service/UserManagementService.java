package com.aniruddha.scloud.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.aniruddha.scloud.model.request.AddUserRequest;

@Service
public class UserManagementService {

	public String addUser(@RequestBody AddUserRequest addUserRequest) {
		return null;
	}
}
