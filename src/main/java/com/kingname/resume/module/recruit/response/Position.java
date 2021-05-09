package com.kingname.resume.module.recruit.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Position {

    private String title;
    private Industry industry;
    private Location location;
    @JsonProperty("job-type")
    private JobType jobType;
    @JsonProperty("job-category")
    private JobCategory jobCategory;
    @JsonProperty("industry-keyword-code")
    private String industryKeywordCode;
    @JsonProperty("job-category-keyword-code")
    private String jobCategoryKeywordCode;
    @JsonProperty("experience-level")
    private ExperienceLevel experienceLevel;
    @JsonProperty("required-education-level")
    private RequiredEducationLevel requiredEducationLevel;

}
