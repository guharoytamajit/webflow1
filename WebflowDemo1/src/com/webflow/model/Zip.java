package com.webflow.model;

import java.io.Serializable;

public class Zip implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8454586366002121558L;
	private String zip;
	private String zip4;

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getZip4() {
		return zip4;
	}

	public void setZip4(String zip4) {
		this.zip4 = zip4;
	}

	@Override
	public String toString() {
		if (zip4 != null && !zip4.trim().equals("")) {
			return zip + "-" + zip4;
		}
		return zip;
	}
}
