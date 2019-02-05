package com.shanmeg.onthego.service;

import com.shanmeg.onthego.domain.Business;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by shantanu on 2/4/19.
 */

@Service
public class OnTheGoServicImpl implements OnTheGoService {

    @Autowired
    private YelpFacade yelpFacade;

    @Override
    public List<Business> searchBusinesses(String term, String location) {
        return yelpFacade.searchBusinesses(term, location);
    }
}
