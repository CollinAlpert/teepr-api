package com.github.collinalpert.teeprapi.entities;

import com.github.collinalpert.java2db.annotations.TableName;
import com.github.collinalpert.java2db.entities.BaseEntity;

@TableName("currency")
public class Currency extends BaseEntity {
	private String name;
	private String symbol;

	public String getName() {
		return name;
	}

	public String getSymbol() {
		return symbol;
	}
}
