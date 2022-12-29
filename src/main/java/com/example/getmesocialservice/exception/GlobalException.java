package com.example.getmesocialservice.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {

	@ExceptionHandler(RestrictedInfoException.class)
	public ResponseEntity<String> restrictedInfoError(RestrictedInfoException exc) {
		return new ResponseEntity<>(exc.getMessage(),HttpStatus.BAD_REQUEST);
	}
	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> noSuchError() {
		return new ResponseEntity<>("no such element exist",HttpStatus.CONFLICT);
	}
}
