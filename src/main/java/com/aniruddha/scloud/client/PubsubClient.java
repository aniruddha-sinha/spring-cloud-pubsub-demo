package com.aniruddha.scloud.client;

import java.util.Map;
import java.util.concurrent.ExecutionException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import com.aniruddha.scloud.constants.Constants;
import com.aniruddha.scloud.controller.BQPublisherController;
import com.aniruddha.scloud.model.AddUserRequest;
import com.aniruddha.scloud.util.MessageUtil;

@Component
public class PubsubClient {

	@Autowired
	private PubSubTemplate pubsubTemplate;

	private static Log log = LogFactory.getLog(PubsubClient.class);

	public String publishToBigQuery(String globalTransactionId, AddUserRequest addUserRequest) {
		String messageId = null;
		Map<String, String> headers = MessageUtil.extractHeader(globalTransactionId);
		ListenableFuture<String> future = pubsubTemplate.publish(Constants.TOPIC_NAME,
				MessageUtil.getJsonFromObject(addUserRequest), headers);
		try {
			messageId = future.get();
			log.info("Received message Id " + messageId);
		} catch (InterruptedException | ExecutionException e) {
			log.error("Error Fetching Message Id from Pubsub " + e.getMessage());
			System.err.println("Error Fetching Message Id from Pubsub " + e.getMessage());
		}
		return messageId;
	}
}
