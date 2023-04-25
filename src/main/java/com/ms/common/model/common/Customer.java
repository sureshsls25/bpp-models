package com.ms.common.model.common;

import com.ms.common.dto.AddressDto;
import lombok.Data;

@Data
public class Customer {
	private Person person;
	private Contact contact;
	private AddressDto address;
}
