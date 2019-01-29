package com.shanmeg.onthego.service;

import com.shanmeg.onthego.domain.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * Created by shantanu on 1/28/19.
 */
public class YelpFacadeImpl implements YelpFacade {

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public List<Business> searchBusinesses() {

        restTemplate.exchange();

    }
}
