package com.ms.common.model.init;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class InitRequest {
	private Context context;
	private InitMessage message;
}
