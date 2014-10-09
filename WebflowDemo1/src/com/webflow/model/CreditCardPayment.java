package com.webflow.model;

import java.io.Serializable;

import com.webflow.validation.ValidationUtils;

import org.springframework.binding.validation.ValidationContext;

public class CreditCardPayment implements Serializable, Payment {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1893781042312552739L;
	private Money amount;
	private String creditCardNumber;
	private String expMonth;
	private String expYear;
	private String cardIssuer;
	private String nameOnCard;

	public String getCreditCardNumber() {
		return creditCardNumber;
	}

	public String getCreditCardNumberSecured() {
		String securedNumber = "************" + creditCardNumber.substring(12);
		return securedNumber;
	}

	public void setCreditCardNumber(String creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public String getExpMonth() {
		return expMonth;
	}

	public void setExpMonth(String expMonth) {
		this.expMonth = expMonth;
	}

	public String getExpYear() {
		return expYear;
	}

	public void setExpYear(String expYear) {
		this.expYear = expYear;
	}

	public String getCardIssuer() {
		return cardIssuer;
	}

	public void setCardIssuer(String cardIssuer) {
		this.cardIssuer = cardIssuer;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public CreditCardPayment(Money amount) {
		this.amount = amount;
	}

	@Override
	public PaymentType getPaymentType() {
		return PaymentType.CREDIT_CARD;
	}

	@Override
	public Money getAmount() {
		return amount;
	}

	public void validateCreditCardPayment(ValidationContext validationContext) {
		if (ValidationUtils.isEmpty(creditCardNumber)) {
			ValidationUtils.messageBuilder(validationContext, "ccNumber",
					"Must enter a credit card number!");
		} else if (!ValidationUtils.isNumeric(creditCardNumber)) {
			ValidationUtils.messageBuilder(validationContext, "ccNumber",
					"Credit card number must be numeric!");
		} else if (!ValidationUtils.checkLength(creditCardNumber, 16)) {
			ValidationUtils.messageBuilder(validationContext, "ccNumber",
					"Invalid credit card number!");
		}
		if (ValidationUtils.isEmpty(cardIssuer)) {
			ValidationUtils.messageBuilder(validationContext, "cardIssuer",
					"Must select a card issuer!");
		}
		if (ValidationUtils.isEmpty(nameOnCard)) {
			ValidationUtils.messageBuilder(validationContext, "nameOnCard",
					"Must enter a card holder name!");
		}
	}
}
