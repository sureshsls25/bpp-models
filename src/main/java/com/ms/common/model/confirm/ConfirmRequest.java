package com.ms.common.model.confirm;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class ConfirmRequest {
	private Context context;
	private ConfirmMessage message;
}
