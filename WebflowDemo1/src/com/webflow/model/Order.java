package com.webflow.model;

import java.io.Serializable;

public class Order implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 364494932099939245L;
	private Pizza pizza = new Pizza();
	private Customer customer = new Customer();
	private Payment payment;

	public Pizza getPizza() {
		return pizza;
	}

	public void setPizzas(Pizza pizza) {
		this.pizza = pizza;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}

	public Money getOrderTotal() {
		double total = 0.0;
		total += pizza.getSize().getMoney().getAmount();
		total += pizza.getToppings().size() * .5;
		return new Money(total);
	}
}
