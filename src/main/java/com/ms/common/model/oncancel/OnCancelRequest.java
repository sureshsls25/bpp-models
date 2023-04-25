package com.ms.common.model.oncancel;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class OnCancelRequest {
	private Context context;
	private OnCancelMessage message;
}