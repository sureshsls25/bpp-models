package com.ms.common.model.oninit;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class OnInitRequest {
	private Context context;
	private OnInitMessage message;
	private Error error;
}