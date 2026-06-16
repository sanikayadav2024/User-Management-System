package com.sanika.exception;

public class UserNotFoundException extends RuntimeException{
  public UserNotFoundException(Long id) {
	  System.out.println("Could Not Found the User with ID " + id);
  }
}
