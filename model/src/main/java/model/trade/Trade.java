package model.trade;

import java.io.Serializable;
import java.util.Date;

import model.OpasObject;
import model.book.Book;
import model.party.Counterparty;
import model.product.Product;

public class Trade extends OpasObject implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5479132378844987426L;

	private String sourceSystemTradeId;
	private String sourceSystemName;
	private Product product;
	private Date valueDate;
	private Date captureDate;
	private String status;
	private Counterparty counterparty;
	private Book book;
	private String channel;
	private long borkerId;
	private long dealerId;

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSourceSystemTradeId() {
		return sourceSystemTradeId;
	}

	public void setSourceSystemTradeId(String sourceSystemTradeId) {
		this.sourceSystemTradeId = sourceSystemTradeId;
	}

	public String getSourceSystemName() {
		return sourceSystemName;
	}

	public void setSourceSystemName(String sourceSystemName) {
		this.sourceSystemName = sourceSystemName;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Date getValueDate() {
		return valueDate;
	}

	public void setValueDate(Date valueDate) {
		this.valueDate = valueDate;
	}

	public Date getCaptureDate() {
		return captureDate;
	}

	public void setCaptureDate(Date captureDate) {
		this.captureDate = captureDate;
	}

	public Counterparty getCounterparty() {
		return counterparty;
	}

	public void setCounterparty(Counterparty counterparty) {
		this.counterparty = counterparty;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	public String getChannel() {
		return channel;
	}

	public void setChannel(String channel) {
		this.channel = channel;
	}

	public long getBorkerId() {
		return borkerId;
	}

	public void setBorkerId(long borkerId) {
		this.borkerId = borkerId;
	}

	public long getDealerId() {
		return dealerId;
	}

	public void setDealerId(long dealerId) {
		this.dealerId = dealerId;
	}

}
