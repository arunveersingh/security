package com.arunveersingh.springbootoauth2server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
//@EnableWebSecurity
public class SpringBootOAuth2ServerApplication /*extends WebSecurityConfigurerAdapter*/ {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootOAuth2ServerApplication.class, args);
	}

}
