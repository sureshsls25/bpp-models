package com.ms.common.model.onstatus;

import com.ms.common.model.common.Order;

import lombok.Data;

import java.util.List;

@Data
public class OnStatusMessage {
	private List<Order> order;
}
