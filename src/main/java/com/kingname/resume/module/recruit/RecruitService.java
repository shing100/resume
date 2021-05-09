package com.kingname.resume.module.recruit;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.kingname.resume.infra.config.RecruitProperties;
import com.kingname.resume.module.recruit.response.Jobs;
import com.kingname.resume.module.utils.MultiValueMapConverter;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.lang.reflect.Type;
import java.util.Map;
import java.util.Objects;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecruitService {

    private final RestTemplate restTemplate;
    private final RecruitProperties recruitProperties;
    private final MultiValueMapConverter multiValueMapConverter;
    private final ObjectMapper objectMapper;

    public void saveRecruitList(RecruitDao recruitDao) {
        UriComponentsBuilder queryParam = UriComponentsBuilder.fromHttpUrl(recruitProperties.getRecruit())
                .queryParam("access-key", recruitProperties.getKey());
        if (!Objects.isNull(recruitDao)) {
            MultiValueMap<String, String> convert = multiValueMapConverter.convert(recruitDao);
            queryParam = queryParam.queryParams(convert);
        }

        Map<String, Object> urlResponse = getUrlResponse(queryParam.build().toUriString());
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
