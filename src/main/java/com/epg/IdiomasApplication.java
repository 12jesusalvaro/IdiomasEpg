package com.epg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.epg")
public class IdiomasApplication {

	public static void main(String[] args) {
		SpringApplication.run(IdiomasApplication.class, args);
	}

}
