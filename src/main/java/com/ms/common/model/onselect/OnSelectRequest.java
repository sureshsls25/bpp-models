package com.ms.common.model.onselect;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class OnSelectRequest {
	private Context context;
	private OnSelectMessage message;
	private Error error;
}