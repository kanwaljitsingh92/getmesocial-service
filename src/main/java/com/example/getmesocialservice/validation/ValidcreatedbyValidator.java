package com.example.getmesocialservice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class ValidcreatedbyValidator implements ConstraintValidator<Validcreatedby, String> {// String is bcz username
																								// is string

	@Override
	public boolean isValid(String s, ConstraintValidatorContext context) {
		if (s.matches("[a-z0-9]+")) {
			return true;
		} else {
			return false;
		}

	}
}
