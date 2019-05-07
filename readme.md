This directory contains multiple projects to demonstrate Spring Security Concepts.

**spring-security-basic**

This service exposes a rest point with http security with in memory users.

**spring-resource-server**

This service acts as a Spring Boot OAuth2 Resource Server. The endpoints on this resource server interacts with springbootoauth2server using property security.oauth2.resource.token-info-uri=http://localhost:8080/oauth/check_token

Pass the access token to invoke endpoints as in http://localhost:8081/user/?access_token=52ebe557-45df-4c99-9828-423924c6f79x

**springbootoauth2server**

This service acts as Spring Boot OAuth2 Authorization Server.
