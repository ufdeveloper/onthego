package com.shanmeg.onthego.domain;

import lombok.Data;

/**
 * Created by shantanu on 1/28/19.
 */

@Data
public class Business {

    private String id;
    private String name;
    private int reviewCount;
    private float rating;
    private Location location;
}
