package model.product.fx;

import java.util.Date;

public class FxOptionForward extends FxForward {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7996982483098735892L;

	private Date optionStartDate;
	private Date optionEndDate;

	private double outstandingBoughtCurrencyAmount;

	public Date getOptionStartDate() {
		return optionStartDate;
	}

	public void setOptionStartDate(Date optionStartDate) {
		this.optionStartDate = optionStartDate;
	}

	public Date getOptionEndDate() {
		return optionEndDate;
	}

	public void setOptionEndDate(Date optionEndDate) {
		this.optionEndDate = optionEndDate;
	}

	public double getOutstandingBoughtCurrencyAmount() {
		return outstandingBoughtCurrencyAmount;
	}

	public void setOutstandingBoughtCurrencyAmount(double outstandingBoughtCurrencyAmount) {
		this.outstandingBoughtCurrencyAmount = outstandingBoughtCurrencyAmount;
	}
}
