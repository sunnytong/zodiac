package model.product.moneymarket;

import java.io.Serializable;
import java.util.Date;

import model.product.Product;

public class TermLoanDeposit extends Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 339388817931406326L;

	private final String MONEY_MARKET = "MMK";

	private Date valueDate;
	private Date maturityDate;

	private String currencyCode;
	private double startPrincipalAmount;
	private double endPrincipalAmount;
	private double endInterestAmount;

	private double contractRate;

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Date getMaturityDate() {
		return maturityDate;
	}

	public void setMaturityDate(Date maturityDate) {
		this.maturityDate = maturityDate;
	}

	public String getCurrencyCode() {
		return currencyCode;
	}

	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}

	public double getStartPrincipalAmount() {
		return startPrincipalAmount;
	}

	public void setStartPrincipalAmount(double startPrincipalAmount) {
		this.startPrincipalAmount = startPrincipalAmount;
	}

	public double getEndPrincipalAmount() {
		return endPrincipalAmount;
	}

	public void setEndPrincipalAmount(double endPrincipalAmount) {
		this.endPrincipalAmount = endPrincipalAmount;
	}

	public double getEndInterestAmount() {
		return endInterestAmount;
	}

	public void setEndInterestAmount(double endInterestAmount) {
		this.endInterestAmount = endInterestAmount;
	}

	public double getContractRate() {
		return contractRate;
	}

	public void setContractRate(double contractRate) {
		this.contractRate = contractRate;
	}

	public String getMONEY_MARKET() {
		return MONEY_MARKET;
	}

	@Override
	public String getProductDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getProductFamily() {
		return MONEY_MARKET;
	}

}
