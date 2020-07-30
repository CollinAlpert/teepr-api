package com.github.collinalpert.teeprapi.entities;

import com.github.collinalpert.java2db.annotations.TableName;
import com.github.collinalpert.java2db.entities.BaseEntity;

@TableName("billingRate")
public class BillingRate extends BaseEntity {
	private long userId;
	private double rate;
	private long currencyId;

	public long getUserId() {
		return userId;
	}

	public double getRate() {
		return rate;
	}

	public long getCurrencyId() {
		return currencyId;
	}
}
