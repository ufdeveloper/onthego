package com.shanmeg.onthego.service;

import com.shanmeg.onthego.domain.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by shantanu on 2/3/19.
 */

@Service
public class OnTheGoServiceImpl implements OnTheGoService {

    @Autowired
    private YelpFacade yelpFacade;

    @Override
    public List<Business> searchBusinesses(String term, String location) {

        Assert.isTrue(!StringUtils.isEmpty(term), "search term cannot be empty");
        Assert.isTrue(!StringUtils.isEmpty(location), "search location cannot be empty");

        return yelpFacade.searchBusinesses(term, location);
    }
}
