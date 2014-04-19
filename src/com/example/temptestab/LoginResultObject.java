package com.example.temptestab;

import java.util.List;


public class LoginResultObject {
	private Integer success;
	private String message;
	private List<LoginResultDataObject> data;

	LoginResultObject() {

	}

	public Integer getSuccess() {
		return success;
	}

	public void setSuccess(Integer success) {
		this.success = success;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public List<LoginResultDataObject> getData() {
		return data;
	}

	public void setData(List<LoginResultDataObject> data) {
		this.data = data;
	}
}
