package com.hotel.service.Exception;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(value = ResourceNotFoundException.class)
	public ResponseEntity<Map<String, Object>> noHandelerFound(ResourceNotFoundException ex) {

		Map<String, Object> obj = new HashMap<>();

		obj.put("message", ex.getMessage());

		obj.put("success", false);

		obj.put("Httpstatus", HttpStatus.BAD_REQUEST);

		return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(obj);

	}

}
