package com.shanmeg.onthego;

import com.shanmeg.onthego.config.ApplicationProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({ApplicationProperties.class})
public class OnthegoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnthegoapiApplication.class, args);
	}

}

