package com.ms.common.model.status;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class StatusRequest {
	private Context context;
	private StatusMessage message;
}
