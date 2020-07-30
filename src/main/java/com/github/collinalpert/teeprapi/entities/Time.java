package com.github.collinalpert.teeprapi.entities;

import com.github.collinalpert.java2db.annotations.TableName;
import com.github.collinalpert.java2db.entities.BaseEntity;

import java.time.LocalTime;

@TableName("time")
public class Time extends BaseEntity {
	private long userId;
	private long projectId;
	private long billingRateId;
	private LocalTime start;
	private LocalTime end;
	private boolean isBillable;

	public long getUserId() {
		return userId;
	}

	public long getProjectId() {
		return projectId;
	}

	public long getBillingRateId() {
		return billingRateId;
	}

	public LocalTime getStart() {
		return start;
	}

	public LocalTime getEnd() {
		return end;
	}

	public boolean isBillable() {
		return isBillable;
	}
}
