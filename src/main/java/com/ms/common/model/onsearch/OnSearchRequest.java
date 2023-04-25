package com.ms.common.model.onsearch;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class OnSearchRequest {
	private Context context;
	private OnSearchMessage message;
	private Error error;
}
