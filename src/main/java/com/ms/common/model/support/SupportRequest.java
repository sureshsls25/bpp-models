package com.ms.common.model.support;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class SupportRequest {
	private Context context;
	private SupportMessage message;
}
