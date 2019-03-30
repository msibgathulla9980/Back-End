package com.bridgelabz.fundoonotes.utility;


import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;


import com.bridgelabz.fundoonotes.model.UserDetails;

public class Validation implements Validator {


	public boolean supports(Class<?> userClass) {
		return UserDetails.class.equals(userClass);
	}

	public void validate(Object target, Errors errors) {
		UserDetails user = (UserDetails) target;

		if (!(user.getName().matches("^[a-zA-Z ]{3,20}$"))) {
			 System.out.println("Name wrong");
			errors.rejectValue("name", "symbolsPresent", new Object[] { "'name'" }, "name can't be symbols");

		}

		if (!(user.getEmailId().matches("^[a-z0-9._%-]+@[a-z0-9.-]+\\.[a-z]{2,4}$"))) {
			 System.out.println("Mobile Number wrong");
			errors.rejectValue("emailId", "symbolsPresent", new Object[] { "'emailId'" }, "emailId can't be symbols");

		}

		if (!(user.getPassword().matches("^[a-zA-Z0-9]{8,20}$"))) {
			 System.out.println("Password wrong");
			errors.rejectValue("password", "symbolsPresent", new Object[] { "'password'" }, "password can't be symbols");
		}

		if (!(String.valueOf(user.getMobileNumber())).matches("^[1-9]{1}[0-9]{9}$")) {
        System.out.println("Mobile Number wrong");
			errors.rejectValue("mobileNumber", "symbolsPresent", new Object[] { "'mobileNumber'" },"mobile number can't be symbols");
		}

		ValidationUtils.rejectIfEmpty(errors, "name", "name.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "password.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "emailId", "emailId.required");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNumber", "mobileNumber.required");
	}

}

