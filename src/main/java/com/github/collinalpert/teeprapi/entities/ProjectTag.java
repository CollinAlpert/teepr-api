package com.github.collinalpert.teeprapi.entities;

import com.github.collinalpert.java2db.annotations.TableName;
import com.github.collinalpert.java2db.entities.BaseEntity;

@TableName("projectTag")
public class ProjectTag extends BaseEntity {
	private long projectId;
	private long tagId;

	public long getProjectId() {
		return projectId;
	}

	public long getTagId() {
		return tagId;
	}
}
