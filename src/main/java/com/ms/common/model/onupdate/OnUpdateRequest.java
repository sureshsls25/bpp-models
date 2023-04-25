package com.ms.common.model.onupdate;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class OnUpdateRequest {
	private Context context;
	private OnUpdateMessage message;
}