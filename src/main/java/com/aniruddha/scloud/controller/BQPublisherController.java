package com.aniruddha.scloud.controller;

import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aniruddha.scloud.model.AddUserRequest;
import com.aniruddha.scloud.service.BQPublisherService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/apis")
public class BQPublisherController {

	@Autowired
	private BQPublisherService publisherService;

	private static Log log = LogFactory.getLog(BQPublisherController.class);
	@PostMapping("/bq/publish")
	@ApiOperation("REST API to publish message to a Google Big Query Subscription API")
	public String publishToBigQuery(@RequestHeader("x_global_transaction_id") String globalTransactionId,
			@RequestBody AddUserRequest addUserRequest) throws Exception {
		if (Objects.isNull(globalTransactionId)) {
			log.error("Global Transaction ID cannot be Null");
			throw new Exception("Global Transaction ID cannot be Null");
		}
		return publisherService.publishToBigQuery(globalTransactionId, addUserRequest);
	}
}
