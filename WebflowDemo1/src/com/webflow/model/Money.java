package com.webflow.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class Money implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2071320351924070644L;
	private double amount;
	private static NumberFormat currencyFormat = NumberFormat
			.getCurrencyInstance(Locale.US);

	public Money(double amount) {
		this.amount = amount;
	}

	public double getAmount() {
		return amount;
	}

	@Override
	public String toString() {
		return currencyFormat.format(amount);
	}
}
