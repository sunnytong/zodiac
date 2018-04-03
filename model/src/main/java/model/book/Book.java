package model.book;

import java.io.Serializable;

import model.OpasObject;
import model.party.Organization;

public class Book extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6583292297136670979L;

	private String name;
	private String description;
	private String indicator;

	private Organization organization;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public Organization getOrganization() {
		return organization;
	}

	public void setOrganization(Organization organization) {
		this.organization = organization;
	}

}
