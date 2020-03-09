package com.elton.app.springboothystrix.exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice @RestController
public class CustomizedResponseEntityExceptionHandler extends ResponseEntityExceptionHandler{

	private static final int NOT_FOUND = 404;

	@ExceptionHandler(TaskNotFoundException.class)
	public final ResponseEntity<ExceptionResponse> handleCategoryNotFoundException(final TaskNotFoundException ex, final WebRequest request) {
		final ExceptionResponse exceptionResponse = new ExceptionResponse(NOT_FOUND, LocalDateTime.now(), ex.getMessage(), request.getDescription(false));
		return new ResponseEntity<>(exceptionResponse, HttpStatus.NOT_FOUND);
	}
}