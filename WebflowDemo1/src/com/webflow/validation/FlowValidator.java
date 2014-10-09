package com.webflow.validation;

import com.webflow.model.Address;
import com.webflow.model.Flow;
import com.webflow.model.Hobbies;
import com.webflow.model.Name;
import com.webflow.model.PersonalInfo;

import org.springframework.binding.validation.ValidationContext;
import org.springframework.stereotype.Component;

/*
FlowValidator  -> here <Flow>Validator  Flow is the model we have given in the main-flow.xml (flow config file)
AddressValidator  -> Here <Address>validator  Address is the id you have provided in the main-flow.xml

*/


@Component
public class FlowValidator {
	public void validateAddress(Flow flow, ValidationContext validationContext) {
		Address address = flow.getOrder().getCustomer().getAddress();
		if (ValidationUtils.isEmpty(address.getAddressLine1())) {
			ValidationUtils.messageBuilder(validationContext, "addrLine1",
					"Must enter a street address!");
		}
		if (ValidationUtils.isEmpty(address.getCity())) {
			ValidationUtils.messageBuilder(validationContext, "city",
					"Must enter a city!");
		}
		if (ValidationUtils.isEmpty(address.getState())) {
			ValidationUtils.messageBuilder(validationContext, "state",
					"Must select a state!");
		}
		if (ValidationUtils.isEmpty(address.getZip().getZip())) {
			ValidationUtils.messageBuilder(validationContext, "zip",
					"Must enter a zip code!");
		} else if (!ValidationUtils.isNumeric(address.getZip().getZip())) {
			ValidationUtils.messageBuilder(validationContext, "zip",
					"Zip code must be numeric!");
		} else if (!ValidationUtils.checkLength(address.getZip().getZip(), 5)) {
			ValidationUtils.messageBuilder(validationContext, "zip",
					"Invalid zip code!");
		}
		if (!ValidationUtils.isEmpty(address.getZip().getZip4())) {
			if (!ValidationUtils.isNumeric(address.getZip().getZip4())) {
				ValidationUtils.messageBuilder(validationContext, "zip4",
						"Zip4 code must be numeric!");
			} else if (!ValidationUtils.checkLength(address.getZip().getZip4(),
					4)) {
				ValidationUtils.messageBuilder(validationContext, "zip",
						"Invalid zip4 code!");
			}
		}
	}

	public void validateOrderPizza(Flow flow,
			ValidationContext validationContext) {
		if (flow.getOrder().getPizza().getSize() == null) {
			ValidationUtils.messageBuilder(validationContext, "Size",
					"Must select a pizza size!");
		}
	}
	
	
	public void validateName(Flow flow, ValidationContext validationContext) {
		Name name = flow.getOrder().getCustomer().getName();
		if (ValidationUtils.isEmpty(name.getfName())) {
			ValidationUtils.messageBuilder(validationContext, "fname",
					"First Name cannot be empty");
		}
		if (ValidationUtils.isEmpty(name.getlName())) {
			ValidationUtils.messageBuilder(validationContext, "lname",
					"Last Name cannot be empty");
		}
	}
	
	public void validateHobAndPersonal(Flow flow, ValidationContext validationContext) {
		
		Hobbies hob =flow.getOrder().getCustomer().getHobbies();
		PersonalInfo per =flow.getOrder().getCustomer().getPersonalInfo();
		
		if (ValidationUtils.isEmpty(hob.getHobbiesName())) {
			ValidationUtils.messageBuilder(validationContext, "hName",
					"Hobbie Name cannot be empty");
		}
		if (ValidationUtils.isEmpty(per.getMartialStatus())) {
			ValidationUtils.messageBuilder(validationContext, "mStatus",
					"Maritial Status cannot be empty");
		}
	}
	
}
