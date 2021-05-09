package com.kingname.resume.module.recruit.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Position {

    public String title;
    public Industry industry;
    public Location location;
    @JsonProperty("job-type")
    public JobType jobType;
    @JsonProperty("job-category")
    public JobCategory jobCategory;
    @JsonProperty("industry-keyword-code")
    public String industryKeywordCode;
    @JsonProperty("job-category-keyword-code")
    public String jobCategoryKeywordCode;
    @JsonProperty("experience-level")
    public ExperienceLevel experienceLevel;
    @JsonProperty("required-education-level")
    public RequiredEducationLevel requiredEducationLevel;

}
