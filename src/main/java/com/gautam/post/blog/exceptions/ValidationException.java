package com.gautam.post.blog.exceptions;

import org.springframework.http.HttpStatus;

public class ValidationException extends ServiceException {
	public ValidationException(String msg, HttpStatus status) {
		super(status.value(),msg);
	}
}
