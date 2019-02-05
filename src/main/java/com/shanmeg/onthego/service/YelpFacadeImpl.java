package com.shanmeg.onthego.service;

import com.shanmeg.onthego.config.ApplicationProperties;
import com.shanmeg.onthego.domain.Business;
import com.shanmeg.onthego.exceptions.InternalServerErrorException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Map;

/**
 * Created by shantanu on 1/28/19.
 */

@Service
@Slf4j
public class YelpFacadeImpl implements YelpFacade {

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ApplicationProperties applicationProperties;

    @Override
    public List<Business> searchBusinesses(String term, String location) {

        String searchUrl = new StringBuilder()
                .append(applicationProperties.getYelp().getBaseUrl())
                .append("/businesses/search")
                .append("?term=" + term)
                .append("&location=" + location)
                .toString();

        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer lJfQK0JSuesKoXRUkG8PkpoW4sSr0iRR2xFkAO0fqClBKqmQ7EdHDFDDSRek170Ywm5EZ4CwOpzSGTJHrnEaffWP7P2mLCTNCCuJ03XJR1c1FyLY_hdYC8uZAYNKXHYx");
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        ResponseEntity<Map<String, Object>> yelpResponse;

        try {
            yelpResponse = restTemplate.exchange(searchUrl, HttpMethod.GET,
                    httpEntity, new ParameterizedTypeReference<Map<String, Object>>() {});
        } catch (RestClientException rce) {
            log.error("Exception while fetching businesses from Yelp for term={} and location={}, exception={}",
                    term, location, rce.getMessage());
            throw new InternalServerErrorException("Exception while fetching businesses from Yelp");
        }

        Map<String, Object> yelpResponseMap = yelpResponse.getBody();
        return (List<Business>)yelpResponseMap.get("businesses");
    }
}
