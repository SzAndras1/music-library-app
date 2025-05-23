package hu.szandras1.musiclibraryapp.common.exception;

public class ValidationException extends BadRequestException {
	public ValidationException(final String message) {
		super(message);
	}
}
