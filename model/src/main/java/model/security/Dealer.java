package model.security;

import java.io.Serializable;

import model.OpasObject;

public class Dealer extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4950480315862355660L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
