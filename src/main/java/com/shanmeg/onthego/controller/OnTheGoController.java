package com.shanmeg.onthego.controller;

import com.shanmeg.onthego.domain.Business;
import com.shanmeg.onthego.service.OnTheGoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by shantanu on 2/4/19.
 */

@Slf4j
@RestController
public class OnTheGoController {

    @Autowired
    private OnTheGoService onTheGoService;

    @RequestMapping(method = RequestMethod.GET, path = "/businesses")
    public List<Business> searchBusinesses(@RequestParam String term, @RequestParam String location) {

        log.info("Request received to search businesses with term={} and location={}", term, location);
        return onTheGoService.searchBusinesses(term, location);
    }
}
