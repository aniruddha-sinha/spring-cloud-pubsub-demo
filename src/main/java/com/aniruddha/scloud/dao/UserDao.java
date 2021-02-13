package com.aniruddha.scloud.dao;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.aniruddha.scloud.model.User;

public interface UserDao {

	public ResponseEntity<List<User>> getUserDetails();
}
