package com.kingname.resume.module.recruit;

import com.kingname.resume.infra.config.RecruitProperties;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import net.minidev.json.JSONObject;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

@Slf4j
@Service
@RequiredArgsConstructor
public class RecruitService {

    private final RestTemplate restTemplate;
    private final RecruitProperties recruitProperties;

    public void saveRecruitList() {
        JSONObject parameters = new JSONObject();
        parameters.put("access-key", "");
        Map<String, Object> urlResponse = getUrlResponse(parameters);
        log.info(urlResponse.toString());
    }

    private Map<String, Object> getUrlResponse(JSONObject parameters) {
        try {
            HttpHeaders httpHeaders = new HttpHeaders();
            httpHeaders.add(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE);

            HttpEntity<Object> httpEntity = new HttpEntity<>(parameters.toString(), httpHeaders);
            Map<String, Object> body = restTemplate.exchange(recruitProperties.getRecruit(), HttpMethod.POST, httpEntity, Map.class).getBody();
            return body;
        } catch (Exception e) {
            throw new IllegalArgumentException(e);
        }
    }
}
