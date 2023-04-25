package com.ms.common.model.common;

import com.ms.common.enums.AckStatus;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Ack {
	private AckStatus status;
}