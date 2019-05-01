package com.arunveersingh.samples.springsecuritybasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.UserDetailsServiceAutoConfiguration;

/**
 * @author arunveersingh
 * @see UserDetailsServiceAutoConfiguration
 * @see EnableAutoConfiguration
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude = UserDetailsServiceAutoConfiguration.class) // intentionally disabled.
public class SpringSecurityBasicApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityBasicApplication.class, args);
	}

}
