package com.kingname.resume.module.recruit.response;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class ExperienceLevel {
    public int code;
    public int min;
    public int max;
    public String name;
}
