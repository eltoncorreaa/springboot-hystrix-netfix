package com.elton.app.springboothystrix.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
public class TaskNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1513743785646310374L;

	public TaskNotFoundException(final String exception) {
		super(exception);
	}
}