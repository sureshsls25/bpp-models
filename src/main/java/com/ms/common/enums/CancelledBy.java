package com.ms.common.enums;

public enum CancelledBy {

	CONSUMER("CONSUMER"),
	PROVIDER("PROVIDER");

	private final String value;

	CancelledBy(String value) {
		this.value = value;
	}
	
	public String value() {
		return this.value;
	}

}