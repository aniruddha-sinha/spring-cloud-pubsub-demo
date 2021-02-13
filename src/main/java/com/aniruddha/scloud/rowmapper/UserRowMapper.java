package com.aniruddha.scloud.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.jdbc.core.RowMapper;

import com.aniruddha.scloud.model.User;

public class UserRowMapper implements RowMapper<User> {

	private static Log log = LogFactory.getLog(UserRowMapper.class);
	
	@Override
	public User mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		log.info("Entered UserDetail Row Mapper");
		return getUserDetails(resultSet);
	}

	private User getUserDetails(ResultSet resultSet) {

		User user;

		try {
			user = new User();
			log.info("Fetched the ResultSet! Initializing User Object");
			user.setUserId(resultSet.getInt("user_id"));
			user.setEmail(resultSet.getString("user_email"));
			user.setUserName(resultSet.getString("user_name"));
			user.setMobileNumber(resultSet.getString("user_mobile_number"));
			user.setFaxNumber(resultSet.getString("user_fax_number"));
			user.setIsEmailValid(resultSet.getBoolean("is_email_valid"));
			user.setIsMobileValid(resultSet.getBoolean("is_mobile_valid"));
			user.setUserStatus(resultSet.getString("user_status"));
			user.setDeleted(resultSet.getBoolean("is_deleted"));
			user.setCreationTimestamp(resultSet.getString("creation_timestamp"));
			user.setCreatedBy(resultSet.getInt("created_by"));
			user.setModifiedTimestamp(resultSet.getString("modified_timestamp"));
			user.setModifiedBy(resultSet.getInt("modified_by"));
		} catch (SQLException e) {
			log.error("Failed to fetch the Result Set!! UserData will be empty");
			log.error("Getting the error message " + e.getMessage());
			user = null;
		}
		return user;
	}

}
