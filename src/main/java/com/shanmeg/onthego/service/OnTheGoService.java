package com.shanmeg.onthego.service;

import com.shanmeg.onthego.domain.Business;

import java.util.List;

/**
 * Created by shantanu on 2/4/19.
 */
public interface OnTheGoService {

    List<Business> searchBusinesses(String term, String location);
}
