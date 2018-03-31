package model.organization;

import java.io.Serializable;

import model.OpasObject;

public class Organization extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5473972005284048769L;

	private String countryCode;
	private String groupMemberAbbreviation;
	private int branchNumber;
	private String name;
	private String bicCode;

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getGroupMemberAbbreviation() {
		return groupMemberAbbreviation;
	}

	public void setGroupMemberAbbreviation(String groupMemberAbbreviation) {
		this.groupMemberAbbreviation = groupMemberAbbreviation;
	}

	public int getBranchNumber() {
		return branchNumber;
	}

	public void setBranchNumber(int branchNumber) {
		this.branchNumber = branchNumber;
	}

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
