package hu.szandras1.musiclibraryapp.common.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public class BadRequestException extends RuntimeException{
	private final HttpStatus httpStatus = HttpStatus.BAD_REQUEST;
	private String message;

	public BadRequestException(final String message) {
		this.message = message;
	}
}
