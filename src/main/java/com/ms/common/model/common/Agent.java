package com.ms.common.model.common;

import com.ms.common.dto.AddressDto;
import lombok.Data;

@Data
public class Agent {
	private Person person;
    private Contact contact;
    private Organization organization;
    private AddressDto address;
}
