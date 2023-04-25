package com.ms.common.model.common;

import lombok.Data;

@Data
public class Error {
	private String code;
	private String paths;
	private String message;
}
