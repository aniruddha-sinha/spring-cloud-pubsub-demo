package com.aniruddha.scloud.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/apis")
public class ExampleController {

	private static final Log log = LogFactory.getLog(ExampleController.class);
	
	@GetMapping("")
	@ApiOperation("Get the response for testing purposes")
	public String getResponse() {
		log.info("Information Message");
		return "The app is running";
	}
}
