package com.webflow.model;

import java.io.Serializable;

public enum PaymentType implements Serializable {
	CREDIT_CARD("Credit Card"), E_CHECK("Electronic Check");
	private String displayName;

	private PaymentType(String displayName) {
		this.displayName = displayName;
	}

	public String getDisplayName() {
		return displayName;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
