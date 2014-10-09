package com.webflow.validation;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.validation.ValidationContext;

public class ValidationUtils {

	public static void messageBuilder(ValidationContext validationContext,
			String field, String errorMessage) {
		validationContext.getMessageContext().addMessage(new MessageBuilder().error().source(field).defaultText(errorMessage).build());
	}

	public static boolean isEmpty(String arg){
		return arg == null || arg.trim().equals("");
	}

	public static boolean isNumeric(String arg) {
		try {
			Long.valueOf(arg);
		} catch (NumberFormatException e) {
			return false;
		}
		return true;
	}

	public static boolean checkLength(String arg, int length){
		return arg.length() == length;
	}

}
