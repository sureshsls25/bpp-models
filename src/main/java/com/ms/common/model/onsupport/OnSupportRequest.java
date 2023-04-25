package com.ms.common.model.onsupport;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class OnSupportRequest {
	private Context context;
	private OnSupportMessage message;
}
