package hu.szandras1.musiclibraryapp.controller;

import hu.szandras1.musiclibraryapp.common.exception.BadRequestException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;

public abstract class BaseController{
	@ExceptionHandler(BadRequestException.class)
	public ResponseEntity<String> handleBadRequestException(final BadRequestException exception) {
		return ResponseEntity.status(exception.getHttpStatus()).body(exception.getMessage());
	}
}
