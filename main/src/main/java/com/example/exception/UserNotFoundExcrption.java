package com.example.exception;

@SuppressWarnings("serial")
public class UserNotFoundExcrption extends RuntimeException
{
	

	public UserNotFoundExcrption(String message)
	{
		super(message);
	}
  
}
