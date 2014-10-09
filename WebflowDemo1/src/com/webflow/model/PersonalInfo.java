package com.webflow.model;

import java.io.Serializable;

public class PersonalInfo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3328274949252817730L;
	private String martialStatus;
	public String getMartialStatus() {
		return martialStatus;
	}
	public void setMartialStatus(String martialStatus) {
		this.martialStatus = martialStatus;
	}
	

}
