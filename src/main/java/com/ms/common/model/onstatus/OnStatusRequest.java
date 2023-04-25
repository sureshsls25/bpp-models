package com.ms.common.model.onstatus;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class OnStatusRequest {
	private Context context;
	private OnStatusMessage message;
	private Error error;
}