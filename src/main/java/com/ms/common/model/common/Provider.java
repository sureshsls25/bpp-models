package com.ms.common.model.common;

import java.util.List;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import com.ms.common.dto.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class Provider {
	private String id;
	private Descriptor descriptor;
	
	@JsonProperty("category_id")
	private String categoryId;
	private Time time;
	private Set<Category> categories;
	private List<Fulfillment> fulfillments;
	private List<Location> locations;
	private List<Offer> offers;
	private List<Item> items;
	private String exp;
	//private boolean rateable;
	private String ttl;
	private List<TagGroup> tags;
	private AboutMentorDto aboutMentor;
	private List<SkillDto> skill;
	private List<EducationDto> education;
	private String totalMeetings;
	private List<ProfessionalExperienceDto> professionalExperience;
	private Customer customer;
	private Agent agent;
}
