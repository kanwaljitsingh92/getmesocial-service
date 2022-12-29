package com.example.getmesocialservice.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;



public class ValidNameValidator implements ConstraintValidator<ValidName, String>{// String is bcz username is string

	@Override
	public boolean isValid(String s, ConstraintValidatorContext context) {
		if(s.matches("[a-zA-Z .]+")) {
			return true;
		}else {
		return false;
		}
		
	}
}
