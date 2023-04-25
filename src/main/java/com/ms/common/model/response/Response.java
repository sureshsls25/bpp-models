package com.ms.common.model.response;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class Response {
	private Context context;
	private ResponseMessage message;
	private Error error;
}
