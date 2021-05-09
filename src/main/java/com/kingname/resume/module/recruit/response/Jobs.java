package com.kingname.resume.module.recruit.response;

import lombok.Data;
import lombok.ToString;

import java.util.List;

@Data
@ToString
public class Jobs {

    private int count;
    private int start;
    private String total;
    private List<Job> job;

}
