package com.kingname.resume.module.recruit.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.kingname.resume.module.recruit.Recruit;
import lombok.Data;
import lombok.ToString;

import java.util.Date;

@Data
@ToString
public class Job {

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
