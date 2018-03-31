package model.product.fx;

import java.io.Serializable;
import java.util.Date;

import model.product.Product;

public class FxSpot extends Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8219630427421109855L;

	private static final String PRODUCT_FAMILY_FX = "Fx";

	private Date valueDate;
	private String boughtCurrencyCode;
	private double boughtCurrencyAmount;

	private String soldCurrencyCode;
	private double soldCurrencyAmount;

	private double contractRate;

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public String getBoughtCurrencyCode() {
		return boughtCurrencyCode;
	}

	public void setBoughtCurrencyCode(String boughtCurrencyCode) {
		this.boughtCurrencyCode = boughtCurrencyCode;
	}

	public double getBoughtCurrencyAmount() {
		return boughtCurrencyAmount;
	}

	public void setBoughtCurrencyAmount(double boughtCurrencyAmount) {
		this.boughtCurrencyAmount = boughtCurrencyAmount;
	}

	public String getSoldCurrencyCode() {
		return soldCurrencyCode;
	}

	public void setSoldCurrencyCode(String soldCurrencyCode) {
		this.soldCurrencyCode = soldCurrencyCode;
	}

	public double getSoldCurrencyAmount() {
		return soldCurrencyAmount;
	}

	public void setSoldCurrencyAmount(double soldCurrencyAmount) {
		this.soldCurrencyAmount = soldCurrencyAmount;
	}

	public double getContractRate() {
		return contractRate;
	}

	public void setContractRate(double contractRate) {
		this.contractRate = contractRate;
	}

	@Override
	public String getProductDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductFamily() {
		return PRODUCT_FAMILY_FX;
	}

}
