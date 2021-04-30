package com.kingname.resume.module.recruit;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;
import java.util.List;

@Entity
@Getter @Setter @ToString
@EqualsAndHashCode(of = "id")
public class Recruit {

    @Id @GeneratedValue
    private Long id;

    public class Detail{
        public String href;
        public String name;
    }

    public class Company{
        public Detail detail;
    }

    public class Industry{
        public String code;
        public String name;
    }

    public class Location{
        public String code;
        public String name;
    }

    public class JobType{
        public String code;
        public String name;
    }

    public class JobCategory{
        public String code;
        public String name;
    }

    public class ExperienceLevel{
        public int code;
        public int min;
        public int max;
        public String name;
    }

    public class RequiredEducationLevel{
        public String code;
        public String name;
    }

    public class Position{
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

    public class Salary{
        public String code;
        public String name;
    }

    public class CloseType{
        public String code;
        public String name;
    }

    public class Job{
        public String url;
        public int active;
        public Company company;
        public Position position;
        public String keyword;
        public Salary salary;
        public String id;
        @JsonProperty("posting-timestamp")
        public String postingTimestamp;
        @JsonProperty("posting-date")
        public Date postingDate;
        @JsonProperty("modification-timestamp")
        public String modificationTimestamp;
        @JsonProperty("opening-timestamp")
        public String openingTimestamp;
        @JsonProperty("expiration-timestamp")
        public String expirationTimestamp;
        @JsonProperty("expiration-date")
        public Date expirationDate;
        @JsonProperty("close-type")
        public CloseType closeType;
        @JsonProperty("read-cnt")
        public String readCnt;
        @JsonProperty("apply-cnt")
        public String applyCnt;
    }

    public class Jobs{
        public int count;
        public int start;
        public String total;
        public List<Job> job;
    }

    public class Root{
        public Jobs jobs;
    }
}
