package com.crosspay.CurrencyConverterAPI.Entity;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity(name = "CURRENCYCONVERTER")
@Table(name = "CURRENCYCONVERTER")
@IdClass(CurrencyConverterId.class)
public class CurrencyConverterEntity {
	
	/*
	 * CURRENCYCONVERTER -Table created in rate schema.
	 * Primary key for this table is fromCurrency and toCurrency
	 */
	@Id
	@Column(length = 3)
	private String fromCurrency;
	@Id
	@Column(length = 3)
	private String toCurrency;
	private double rate;
	public String getFromCurrency() {
		return fromCurrency;
	}
	public void setFromCurrency(String fromCurrency) {
		this.fromCurrency = fromCurrency;
	}
	public String getToCurrency() {
		return toCurrency;
	}
	public void setToCurrency(String toCurrency) {
		this.toCurrency = toCurrency;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	

}
