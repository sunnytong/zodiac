package model.product;

import model.OpasObject;

public abstract class Product extends OpasObject {

	private long tradeId;

	public abstract String getProductDescription();

	public abstract String getProductFamily();

	public long getTradeId() {
		return tradeId;
	}

	public void setTradeId(long tradeId) {
		this.tradeId = tradeId;
	}

}
