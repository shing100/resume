package com.kingname.resume.module.recruit.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingname.resume.module.recruit.Recruit;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Job {

    private String url;
    private int active;
    private Company company;
    private Position position;
    private String keyword;
    private Salary salary;
    private String id;
    @JsonProperty("posting-timestamp")
    private String postingTimestamp;
    @JsonProperty("posting-date")
    private Date postingDate;
    @JsonProperty("modification-timestamp")
    private String modificationTimestamp;
    @JsonProperty("opening-timestamp")
    private String openingTimestamp;
    @JsonProperty("expiration-timestamp")
    private String expirationTimestamp;
    @JsonProperty("expiration-date")
    private Date expirationDate;
    @JsonProperty("close-type")
    private CloseType closeType;
    @JsonProperty("read-cnt")
    private String readCnt;
    @JsonProperty("apply-cnt")
    private String applyCnt;

}
