package com.webflow.model;

import java.io.Serializable;

public interface Payment extends Serializable {
	public PaymentType getPaymentType();
	public Money getAmount();
}
