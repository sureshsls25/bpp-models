package com.ms.common.model.common;

import java.util.List;

import com.ms.common.enums.OrderStatus;
import lombok.Data;

@Data
public class Fulfillment {
	private String id;
	private String type;
	private List<String> language;
	private OrderState state;
	private boolean tracking;
	private Customer customer;
	private Agent agent;
	private Contact contact;
	private List<Stop> stops;
	private String path;
	private List<TagGroup> tags;
	private Time time;
	private OrderStatus status;
}
