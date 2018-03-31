package model;

import java.sql.Timestamp;

public abstract class OpasObject {

	private long id;
	private int version;
	private long lastUpdatedUser;
	private Timestamp lastUpdatedDatetime;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public int getVersion() {
		return version;
	}

	public void setVersion(int version) {
		this.version = version;
	}

	public long getLastUpdatedUser() {
		return lastUpdatedUser;
	}

	public void setLastUpdatedUser(long lastUpdatedUser) {
		this.lastUpdatedUser = lastUpdatedUser;
	}

	public Timestamp getLastUpdatedDatetime() {
		return lastUpdatedDatetime;
	}

	public void setLastUpdatedDatetime(Timestamp lastUpdatedDatetime) {
		this.lastUpdatedDatetime = lastUpdatedDatetime;
	}

}
