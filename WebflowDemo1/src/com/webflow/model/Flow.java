package com.webflow.model;

import java.io.Serializable;

public class Flow implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 609273349601233711L;
	private User user;
	private Order order;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Order getOrder() {
		if (order == null) {
			order = new Order();
		}
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}
