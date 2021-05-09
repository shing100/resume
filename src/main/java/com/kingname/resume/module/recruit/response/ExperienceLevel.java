package com.kingname.resume.module.recruit.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ExperienceLevel {
    private int code;
    private int min;
    private int max;
    private String name;
}
