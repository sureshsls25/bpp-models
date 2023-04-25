package com.ms.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.ms.common.model.common.Provider;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class AddMentorDataRequest {
    private List<Provider> providers;
}
