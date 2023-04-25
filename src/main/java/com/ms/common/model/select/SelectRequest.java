package com.ms.common.model.select;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class SelectRequest {
	private Context context;
	private SelectMessage message;
}
