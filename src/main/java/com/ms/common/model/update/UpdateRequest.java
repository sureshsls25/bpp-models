package com.ms.common.model.update;

import com.ms.common.model.common.Context;

import lombok.Data;

@Data
public class UpdateRequest {
	private Context context;
	private UpdateMessage message;
}