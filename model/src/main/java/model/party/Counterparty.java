package model.party;

import java.io.Serializable;

public class Counterparty extends Party implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3649992882039242939L;

	private long parentCounterpartyId;

	public long getParentCounterpartyId() {
		return parentCounterpartyId;
	}

	public void setParentCounterpartyId(long parentCounterpartyId) {
		this.parentCounterpartyId = parentCounterpartyId;
	}

}
