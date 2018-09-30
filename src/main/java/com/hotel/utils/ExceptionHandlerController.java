package com.hotel.utils;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;

import com.hotel.model.CustomError;

@ControllerAdvice
public class ExceptionHandlerController {
	private Log Logger=LogFactory.getLog(this.getClass());
	
	@RequestMapping(produces = "application/json")
	@ExceptionHandler(Exception.class)
	public ResponseEntity<CustomError> handleException(HttpServletRequest req, Exception e) {
		Logger.error("Error handling request : "+req.getRequestURL()+ ", message: "+e.getMessage());
		CustomError err = new CustomError(HttpStatus.BAD_REQUEST, e.getMessage());
		return new ResponseEntity<>(err,HttpStatus.BAD_REQUEST);
	}
}
	