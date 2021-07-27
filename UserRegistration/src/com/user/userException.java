package com.user;

@SuppressWarnings("serial")
public class userException extends Exception {
	String errorMessage;

	public userException(String message) {
		this.errorMessage = message;
	}
}
