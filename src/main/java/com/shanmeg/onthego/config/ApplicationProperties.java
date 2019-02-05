package com.shanmeg.onthego.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * Created by shantanu on 2/4/19.
 */

@Data
@ConfigurationProperties
public class ApplicationProperties {

    private final Yelp yelp = new Yelp();

    @Data
    public static class Yelp {
        private String baseUrl;
    }
}
