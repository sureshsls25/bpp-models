package com.ms.common.model.onupdate;

import com.ms.common.model.common.Order;

import lombok.Data;

@Data
public class OnUpdateMessage {
	private Order order;
}
