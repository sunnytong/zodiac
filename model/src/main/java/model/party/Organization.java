package model.party;

import java.io.Serializable;

public class Organization extends Party implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5473972005284048769L;

	private String groupMemberAbbreviation;
	private int branchNumber;

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

}
