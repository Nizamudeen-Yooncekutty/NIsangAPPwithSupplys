package com.nisangapp.nisangapp.Exception;

import org.apache.logging.log4j.message.Message;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class SupplyNotFoundException extends RuntimeException{
	private static final long serialVersionUID = 1L;

	public SupplyNotFoundException(String message) {
		super(message);
		
	}
	
  

}
