package com.ms.common.model.oncancel;

import com.ms.common.model.common.Order;

import lombok.Data;

@Data
public class OnCancelMessage {
	private Order order;
}
