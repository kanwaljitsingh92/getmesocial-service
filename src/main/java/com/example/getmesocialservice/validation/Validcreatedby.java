package com.example.getmesocialservice.validation;

import static java.lang.annotation.ElementType.ANNOTATION_TYPE;
import static java.lang.annotation.ElementType.CONSTRUCTOR;
import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

@Documented
@Constraint(validatedBy = {ValidcreatedbyValidator.class})
@Target({ FIELD, PARAMETER })
@Retention(RUNTIME)
public @interface Validcreatedby{

	String message() default "Not a valid creator";

	Class<?>[] groups() default { };

	Class<? extends Payload>[] payload() default { };
}
