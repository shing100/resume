package com.kingname.resume.infra.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties("saramin")
public class RecruitProperties {

    private String key;
    private String recruit;
}
