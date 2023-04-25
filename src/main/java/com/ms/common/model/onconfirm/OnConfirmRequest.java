package com.ms.common.model.onconfirm;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class OnConfirmRequest {
	private Context context;
	private OnConfirmMessage message;
	private Error error;
}
