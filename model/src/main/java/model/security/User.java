package model.security;

import java.io.Serializable;

import model.OpasObject;

public class User extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -262089161589506708L;

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
