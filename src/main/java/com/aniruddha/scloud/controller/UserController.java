package com.aniruddha.scloud.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/apis")
public class UserController {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@GetMapping("/users/list")
	@ApiOperation("Get the list of Users")
	public List<Map<String, Object>> listUsers() {
	    return jdbcTemplate.queryForList("SELECT * FROM UserDetail;");
	}
}
