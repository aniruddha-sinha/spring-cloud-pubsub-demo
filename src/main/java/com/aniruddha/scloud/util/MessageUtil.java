package com.aniruddha.scloud.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

import com.aniruddha.scloud.model.AddUserRequest;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class MessageUtil {

	public static String getJsonFromObject(AddUserRequest addUserRequest) {
		String message = null;
		try {
			message = new ObjectMapper().writeValueAsString(addUserRequest);
		} catch (JsonProcessingException e) {
			System.err.println("Error Converting Json to String " + e.getMessage());
		}
		return message;
	}

	public static Map<String, String> extractHeader(String globalTransactionId) {
		Map<String, String> headerMap = null;
		headerMap = new HashMap<>();
		headerMap.put("x_global_transaction_id", globalTransactionId);
		return headerMap;
	}
}
