package com.webflow.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Pizza implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 6757951721567345642L;
	private PizzaSize size;
	private List<String> toppings;

	public PizzaSize getSize() {
		return size;
	}

	public void setSize(PizzaSize size) {
		this.size = size;
	}

	public List<String> getToppings() {
		if(toppings == null){
			toppings  = new ArrayList<String>();
		}
		return toppings;
	}

	public void setToppings(List<String> toppings) {
		this.toppings = toppings;
	}
}
