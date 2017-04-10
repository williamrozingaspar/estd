package com.bovespa;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Stock implements Comparable<Stock> {

	private String code;

	private LocalDate date;

	private BigDecimal openPrice;
	
	private BigDecimal closePrice;

	private BigDecimal maxPrice;
	
	private BigDecimal minPrice;
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public BigDecimal getOpenPrice() {
		return openPrice;
	}

	public void setOpenPrice(BigDecimal openPrice) {
		this.openPrice = openPrice;
	}

	public BigDecimal getClosePrice() {
		return closePrice;
	}

	public void setClosePrice(BigDecimal closePrice) {
		this.closePrice = closePrice;
	}

	public BigDecimal getMinPrice() {
		return minPrice;
	}

	public void setMinPrice(BigDecimal minPrice) {
		this.minPrice = minPrice;
	}

	public BigDecimal getMaxPrice() {
		return maxPrice;
	}

	public void setMaxPrice(BigDecimal maxPrice) {
		this.maxPrice = maxPrice;
	}

	@Override
	public int compareTo(Stock arg0) {
		return this.code.compareTo(arg0.getCode());
	}


}
