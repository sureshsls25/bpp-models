package com.ms.common.model.common;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import com.ms.common.dto.OrderDto;
import com.ms.common.dto.SkillDto;
import lombok.Data;

@Data
public class Order {
	private String id;
	private String mailid;
	@JsonProperty("ref_order_ids")
	private List<String> refOrderIds;
	private String status; //Enum [ ACTIVE, COMPLETE, CANCELLED ]
	private String type; //Enum [ DRAFT, DEFAULT ]
	private Provider provider;
	private List<Item> items;
	
	@JsonProperty("add_ons")
	private List<AddOn> addOns;
	
	private List<Offer> offers;
	//private List<Document> documents;
	private Billing billing;
	private List<Fulfillment> fulfillments;
	private Cancellation cancellation;
	
	@JsonProperty("cancellation_terms")
	private List<CancellationTerm> cancellationTerms;
	
	private Quotation quote;
	private List<Payment> payments;
	
	@JsonProperty("created_at")
	private String createdAt;
	
	@JsonProperty("updated_at")
	private String updatedAt;
	
	private XInput xinput;
	
	private List<TagGroup> tags;
	private OrderDto orderDetails;
}
