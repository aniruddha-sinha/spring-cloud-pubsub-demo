package com.aniruddha.scloud.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

@JsonInclude(Include.NON_NULL)
public class User {
	private Integer userId;
	private String userName;
	private String email;
	private String mobileNumber;
	private String faxNumber;
	private Boolean isEmailValid;
	private Boolean isMobileValid;
	private String userStatus;
	private Boolean deleted;
	private String creationTimestamp;
	private Integer createdBy;
	private String modifiedTimestamp;
	private Integer modifiedBy;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getFaxNumber() {
		return faxNumber;
	}

	public void setFaxNumber(String faxNumber) {
		this.faxNumber = faxNumber;
	}

	public Boolean getIsEmailValid() {
		return isEmailValid;
	}

	public void setIsEmailValid(Boolean isEmailValid) {
		this.isEmailValid = isEmailValid;
	}

	public Boolean getIsMobileValid() {
		return isMobileValid;
	}

	public void setIsMobileValid(Boolean isMobileValid) {
		this.isMobileValid = isMobileValid;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public Boolean isDeleted() {
		return deleted;
	}

	public void setDeleted(Boolean isDeleted) {
		this.deleted = isDeleted;
	}

	public String getCreationTimestamp() {
		return creationTimestamp;
	}

	public void setCreationTimestamp(String creationTimestamp) {
		this.creationTimestamp = creationTimestamp;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifiedTimestamp() {
		return modifiedTimestamp;
	}

	public void setModifiedTimestamp(String modifiedTimestamp) {
		this.modifiedTimestamp = modifiedTimestamp;
	}

	public Integer getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(Integer modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

}
