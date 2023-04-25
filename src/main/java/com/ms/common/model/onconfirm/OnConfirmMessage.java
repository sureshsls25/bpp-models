package com.ms.common.model.onconfirm;

import com.ms.common.model.common.Order;

import lombok.Data;

@Data
public class OnConfirmMessage {
	private Order order;
}
