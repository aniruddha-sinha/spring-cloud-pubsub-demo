package com.aniruddha.scloud.dao;

import org.springframework.web.bind.annotation.RequestBody;

import com.aniruddha.scloud.model.request.AddUserRequest;

public interface UserManagementDao {
	public String addUser(@RequestBody AddUserRequest addUserRequest);
}
