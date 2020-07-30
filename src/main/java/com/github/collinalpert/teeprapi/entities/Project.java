package com.github.collinalpert.teeprapi.entities;

import com.github.collinalpert.java2db.annotations.TableName;
import com.github.collinalpert.java2db.entities.BaseEntity;

@TableName("project")
public class Project extends BaseEntity {
	private long userId;
	private long clientId;
	private String name;
	private long billingRateId;

	public long getUserId() {
		return userId;
	}

	public long getClientId() {
		return clientId;
	}

	public String getName() {
		return name;
	}

	public long getBillingRateId() {
		return billingRateId;
	}
}
