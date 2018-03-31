package model.product.fx;

public class FxNonDeliverableForward extends FxForward {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8852677583540451042L;

	private String settlementCurrencyCode;

	public String getSettlementCurrencyCode() {
		return settlementCurrencyCode;
	}

	public void setSettlementCurrencyCode(String settlementCurrencyCode) {
		this.settlementCurrencyCode = settlementCurrencyCode;
	}

}
