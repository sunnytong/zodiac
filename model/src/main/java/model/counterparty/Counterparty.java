package model.counterparty;

import java.io.Serializable;

import model.OpasObject;

public class Counterparty extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3649992882039242939L;

	private String name;
	private String bicCode;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBicCode() {
		return bicCode;
	}

	public void setBicCode(String bicCode) {
		this.bicCode = bicCode;
	}

}
