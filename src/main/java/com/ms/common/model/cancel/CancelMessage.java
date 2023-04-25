package com.ms.common.model.cancel;

import com.ms.common.model.common.Descriptor;

import lombok.Data;

@Data
public class CancelMessage {
	private String orderId;
	private String cancellationReasonId;
	private Descriptor descriptor;
}