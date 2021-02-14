package com.installation.instalApp.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.installation.instalApp.model.ErrorMessage;


@ControllerAdvice
public class ExceptionHandlerClass extends ResponseEntityExceptionHandler{
	
	@ExceptionHandler(Exception.class)
	public final ResponseEntity<ErrorMessage> generalException(Exception ex, WebRequest request){
		ErrorMessage errorMessage = new ErrorMessage(ex.getMessage(), request.getDescription(false), HttpStatus.BAD_REQUEST.value()); 
		
		return new ResponseEntity<>(errorMessage, new HttpHeaders(), HttpStatus.BAD_REQUEST);
		
	}

}
