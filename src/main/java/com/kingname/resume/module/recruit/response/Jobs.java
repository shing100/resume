package com.kingname.resume.module.recruit.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Jobs {

    public int count;
    public int start;
    public String total;
    public List<Job> job;

}
