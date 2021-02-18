package com.aniruddha.scloud.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aniruddha.scloud.client.PubsubClient;
import com.aniruddha.scloud.model.AddUserRequest;

@Service
public class BQPublisherService {

	@Autowired
	private PubsubClient pubsubClient;

	private static Log log = LogFactory.getLog(BQPublisherService.class);
	
	public String publishToBigQuery(String globalTransactionId, AddUserRequest addUserRequest) {
		log.info("Entered BQ Publisher Service");
		return pubsubClient.publishToBigQuery(globalTransactionId, addUserRequest);
	}
}
