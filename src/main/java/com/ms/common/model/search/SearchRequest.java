package com.ms.common.model.search;

import com.ms.common.model.common.Context;
import com.ms.common.model.common.Error;

import lombok.Data;

@Data
public class SearchRequest {
	private Context context;
	private SearchMessage message;
	//private Error error;
}
