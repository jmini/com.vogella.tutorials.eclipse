package com.vogella.rcp.editor.example.model;

public class Todo {
	private String summary = "";
	private String description = "";

	public Todo(String summary) {
		this.summary = summary;
	}

	public Todo(String summary, String description) {
		this.summary = summary;
		this.description = description;

	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Todo: " + summary;
	}
}
