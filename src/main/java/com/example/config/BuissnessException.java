package com.example.config;

public class BuissnessException extends Exception {
	
	private String message;
	
	public BuissnessException(String message){
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "BuissnessException [message=" + message + "]";
	}

}
