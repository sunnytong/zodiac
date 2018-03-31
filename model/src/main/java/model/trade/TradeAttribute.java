package model.trade;

import java.io.Serializable;

import model.OpasObject;

public class TradeAttribute extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 135501424766022257L;

	private long tradeId;

	private String key;
	private String value;

	public String getKey() {
		return key;
	}

	public long getTradeId() {
		return tradeId;
	}

	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
