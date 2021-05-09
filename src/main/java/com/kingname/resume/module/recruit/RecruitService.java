package com.kingname.resume.module.recruit;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingname.resume.infra.config.RecruitProperties;
import com.kingname.resume.module.recruit.response.Jobs;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecruitService {

    private final RestTemplate restTemplate;
    private final RecruitProperties recruitProperties;
    private final ModelMapper modelMapper;
    private final ObjectMapper objectMapper;

    public void saveRecruitList() {
        UriComponents build = UriComponentsBuilder.fromHttpUrl(recruitProperties.getRecruit())
                .queryParam("access-key", recruitProperties.getKey()).build();
        Map<String, Object> urlResponse = getUrlResponse(build.toUriString());
        Jobs jobs = objectMapper.convertValue(urlResponse.get("jobs"), Jobs.class);
        log.info(jobs.toString());
    }

    private Map<String, Object> getUrlResponse(String url) {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);
            HttpEntity<Object> httpEntity = new HttpEntity<>(httpHeaders);
            Map<String, Object> body = restTemplate.exchange(url, HttpMethod.GET, httpEntity, Map.class).getBody();
            return body;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
