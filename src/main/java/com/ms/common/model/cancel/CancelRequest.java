package com.ms.common.model.cancel;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class CancelRequest {
	private Context context;
	private CancelMessage message;
}
