package com.installation.instalApp.model;

public class ErrorMessage {
	private String message;
	private String details;
	private int code;
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public ErrorMessage(String message, String details, int code) {
		super();
		this.message = message;
		this.details = details;
		this.code = code;
	}
	
}
