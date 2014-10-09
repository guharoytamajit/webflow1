package com.webflow.model;

public enum PizzaSize {
	SMALL("Small", new Money(5.00)), MEDIUM("Medium", new Money(7.50)), LARGE(
			"Large", new Money(10.00));

	private String label;
	private Money money;

	private PizzaSize(String label, Money money) {
		this.label = label;
		this.money = money;
	}

	public String getLabel() {
		return label;
	}

	public Money getMoney() {
		return money;
	}
}
