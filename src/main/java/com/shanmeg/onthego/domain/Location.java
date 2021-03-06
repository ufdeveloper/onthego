package com.shanmeg.onthego.domain;

import lombok.Data;

/**
 * Created by shantanu on 1/28/19.
 */

@Data
public class Location {

    private String address1;
    private String address2;
    private String address3;
    private String city;
    private String zipCode;
    private String country;
    private String state;
    private String[] displayAddress;
    private String[] crossStreets;
}
