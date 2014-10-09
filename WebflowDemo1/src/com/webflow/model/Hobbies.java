package com.webflow.model;

import java.io.Serializable;

public class Hobbies implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3328274949252817730L;
	private String hobbiesName;
	
	public String getHobbiesName() {
		return hobbiesName;
	}
	public void setHobbiesName(String hobbiesName) {
		this.hobbiesName = hobbiesName;
	}
}
