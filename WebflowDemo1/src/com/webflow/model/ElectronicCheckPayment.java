package com.webflow.model;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

import com.webflow.validation.ValidationUtils;

import org.springframework.binding.validation.ValidationContext;

public class ElectronicCheckPayment implements Payment {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7452194510107947520L;

	private Money amount;
	private String signature;
	private String routingNumber;
	private String accountNumber;
	private String checkNumber;
	private Calendar date;
	private String payableTo;

	public String getSignature() {
		return signature;
	}

	public void setSignature(String signature) {
		this.signature = signature;
	}

	public String getRoutingNumber() {
		return routingNumber;
	}

	public void setRoutingNumber(String routingNumber) {
		this.routingNumber = routingNumber;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountNumberSecured() {
		String securedNumber = "************" + accountNumber.substring(6);
		return securedNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public String getCheckNumber() {
		return checkNumber;
	}

	public void setCheckNumber(String checkNumber) {
		this.checkNumber = checkNumber;
	}

	public Calendar getDate() {
		return date;
	}

	public void setDate(Calendar date) {
		this.date = date;
	}

	public String getFormattedDate() {
		StringBuffer buffer = new StringBuffer();
		buffer.append(date.get(Calendar.MONTH) + 1);
		buffer.append("-");
		buffer.append(date.get(Calendar.DAY_OF_MONTH));
		buffer.append("-");
		buffer.append(date.get(Calendar.YEAR));
		return buffer.toString();
	}

	public String getPayableTo() {
		return payableTo;
	}

	public void setPayableTo(String payableTo) {
		this.payableTo = payableTo;
	}

	public ElectronicCheckPayment(Money money) {
		amount = money;
	}

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.E_CHECK;
	}

	@Override
	public Money getAmount() {
		return amount;
	}

	public void validateECheckPayment(ValidationContext validationContext) {
		if (ValidationUtils.isEmpty(routingNumber)) {
			ValidationUtils.messageBuilder(validationContext, "routingNumber",
					"Must enter a routing number!");
		} else if (!ValidationUtils.isNumeric(routingNumber)) {
			ValidationUtils.messageBuilder(validationContext, "routingNumber",
					"Routing number must be numeric!");
		} else if (!ValidationUtils.checkLength(routingNumber, 10)) {
			ValidationUtils.messageBuilder(validationContext, "routingNumber",
					"Invalid routing number!");
		}
		if (ValidationUtils.isEmpty(accountNumber)) {
			ValidationUtils.messageBuilder(validationContext, "accountNumber",
					"Must enter an account number!");
		} else if (!ValidationUtils.isNumeric(accountNumber)) {
			ValidationUtils.messageBuilder(validationContext, "accountNumber",
					"Account number must be numeric!");
		} else if (!ValidationUtils.checkLength(accountNumber, 10)) {
			ValidationUtils.messageBuilder(validationContext, "accountNumber",
					"Account routing number!");
		}
		if (ValidationUtils.isEmpty(signature)) {
			ValidationUtils.messageBuilder(validationContext, "signature",
					"Must give a signature!");
		}
		if (ValidationUtils.isEmpty(checkNumber)) {
			ValidationUtils.messageBuilder(validationContext, "checkNumber",
					"Must enter a check number!");
		} else if (!ValidationUtils.isNumeric(accountNumber)) {
			ValidationUtils.messageBuilder(validationContext, "checkNumber",
					"Check number must be numeric!");
		}
	}
}