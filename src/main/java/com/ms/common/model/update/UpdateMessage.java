package com.ms.common.model.update;

import com.ms.common.model.common.Order;

import lombok.Data;

@Data
public class UpdateMessage {
	private String updateTarget;
	private Order order;
}
