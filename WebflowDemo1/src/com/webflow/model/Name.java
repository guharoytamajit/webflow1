package com.webflow.model;

import java.io.Serializable;

public class Name implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3328274949252817730L;
	private String fName;
	private String lName;

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
}
