package com.aniruddha.scloud.dao.mysql;

import java.util.List;
import java.util.Objects;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.aniruddha.scloud.dao.UserDao;
import com.aniruddha.scloud.model.User;
import com.aniruddha.scloud.rowmapper.UserRowMapper;

@Repository("mysqlUserDetailDao")
public class UserDaoImpl implements UserDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private static Log log = LogFactory.getLog(UserDaoImpl.class);

	@Override
	public ResponseEntity<List<User>> getUserDetails() {
		ResponseEntity<List<User>> userListResponse = null;
		List<User> userList = jdbcTemplate.query(QueryConstants.FETCH_ALL_USER_DETAILS, new UserRowMapper());

		log.info("Query Fetched as ");
		log.info(QueryConstants.FETCH_ALL_USER_DETAILS);

		if (Objects.isNull(userList)) {
			log.warn("Warning !! User Data is Null");
			userListResponse = ResponseEntity.unprocessableEntity().build();
		} else {
			log.info("Successfully fetched User Data");

			userListResponse = ResponseEntity.ok(userList);
		}
		return userListResponse;
	}

	private class QueryConstants {
		private static final String FETCH_ALL_USER_DETAILS = "select * from UserDetail";
	}
}
