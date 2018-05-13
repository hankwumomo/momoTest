package com.momo.webns.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = { "com.momo.webns.web"} )
public class MomoWebnsWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(MomoWebnsWebApplication.class, args);
	}
}
