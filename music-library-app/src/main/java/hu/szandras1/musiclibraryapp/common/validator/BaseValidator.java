package hu.szandras1.musiclibraryapp.common.validator;

import hu.szandras1.musiclibraryapp.common.exception.ValidationException;

public class BaseValidator {
	protected void validateIsNotNull(final Object object, final String message) {
		if (object == null) {
			throw new ValidationException(message + ": is null");
		}
	}

	protected void validateStringMinLength(final String field,
												   final Integer minLength,
												   final String message) {
		if (field.length() < minLength) {
			throw new ValidationException(message + ": too short");
		}
	}

	protected void validateStringMaxLength(final String field,
										   final Integer maxLength,
										   final String message) {
		if (field.length() > maxLength) {
			throw new ValidationException(message + ": too long");
		}
	}
}
