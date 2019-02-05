package com.shanmeg.onthego.service;

import com.shanmeg.onthego.domain.Business;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by shantanu on 1/28/19.
 */

@FeignClient("yelpClient")
public interface YelpFacade {

    @RequestMapping(method = RequestMethod.GET, value = "v3/businesses/search", headers = {"Bearer lJfQK0JSuesKoXRUkG8PkpoW4sSr0iRR2xFkAO0fqClBKqmQ7EdHDFDDSRek170Ywm5EZ4CwOpzSGTJHrnEaffWP7P2mLCTNCCuJ03XJR1c1FyLY_hdYC8uZAYNKXHYx"})
    List<Business> searchBusinesses(@RequestParam("term") String term, @RequestParam("location") String location);
}
