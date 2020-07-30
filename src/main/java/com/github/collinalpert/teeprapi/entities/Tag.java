package com.github.collinalpert.teeprapi.entities;

import com.github.collinalpert.java2db.annotations.TableName;
import com.github.collinalpert.java2db.entities.BaseEntity;

@TableName("tag")
public class Tag extends BaseEntity {
	private long userId;
	private String name;

	public long getUserId() {
		return userId;
	}

	public String getName() {
		return name;
	}
}
