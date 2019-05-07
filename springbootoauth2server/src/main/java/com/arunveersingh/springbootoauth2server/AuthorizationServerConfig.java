package com.arunveersingh.springbootoauth2server;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.oauth2.config.annotation.configurers.ClientDetailsServiceConfigurer;
import org.springframework.security.oauth2.config.annotation.web.configuration.AuthorizationServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.AuthorizationServerSecurityConfigurer;

/**
 * This bean turns off auto-configuration of authorization server - which means Spring Boot will not create a bean of
 * AuthorizationServerConfigurerAdapter with default properties.
 *
 * One of the reason to provide custom AuthorizationServerConfigurerAdapter bean is it is possible to provide
 * multiple clients.
 *
 * See @AuthorizationServerConfig{@link #configure(ClientDetailsServiceConfigurer)}
 *
 * Try, curl first-client:noonewilleverguess@localhost:8080/oauth/token -dgrant_type=client_credentials -dscope=resource:read
 *
 */
@Configuration
public class AuthorizationServerConfig extends AuthorizationServerConfigurerAdapter {

    @Bean
    PasswordEncoder passwordEncoder() {
        return PasswordEncoderFactories.createDelegatingPasswordEncoder();
    }

    @Override
    public void configure(ClientDetailsServiceConfigurer clients) throws Exception {
        /*clients
                .inMemory()
                .withClient("first-client")
                .secret(passwordEncoder().encode("noonewilleverguess"))
                .scopes("resource:read")
                .authorizedGrantTypes("client_credentials");*/

        clients
                .inMemory()
                .withClient("second-client")
                .secret(passwordEncoder().encode("noonewilleverguess"))
                .scopes("resource:read")
                .authorizedGrantTypes("client_credentials");

        clients
                .inMemory()
                .withClient("first-client")
                .secret(passwordEncoder().encode("noonewilleverguess"))
                .scopes("resource:read")
                .authorizedGrantTypes("client_credentials");

        clients
                .inMemory()
                .withClient("supercommandodhruv")
                .secret(passwordEncoder().encode("anupamsinha"))
                .scopes("resource:read")
                .authorizedGrantTypes("client_credentials");
    }

    @Override
    public void configure(AuthorizationServerSecurityConfigurer oauthServer) throws Exception {

        oauthServer.tokenKeyAccess("permitAll()")
                .checkTokenAccess("isAuthenticated()");

    }
}
