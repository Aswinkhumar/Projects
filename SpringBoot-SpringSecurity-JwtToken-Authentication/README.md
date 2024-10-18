# Spring Boot - Spring Security JWT Token Authentication

This project demonstrates how to implement JWT token-based authentication using Spring Boot and Spring Security. It covers various stages of user authentication, starting from basic hardcoded credentials to custom database-driven authentication. The project also introduces JWT (JSON Web Token) to secure the application's endpoints.

## Features:
- **Spring Security Integration**: Provides default login and logout functionality with form-based authentication.
- **In-Memory Authentication**: An initial approach using hardcoded credentials stored in memory.
- **Custom Authentication Provider**: Integrates database-driven user authentication by implementing a custom `UserDetailsService`.
- **JWT Token-Based Authentication**: Secures API endpoints using stateless JWT tokens.

## Project Setup:

1. Clone the repository from GitHub:
   ```bash
   git clone https://github.com/Aswinkhumar/SpringBoot-SpringSecurity-JwtToken-Authentication.git

## Authentication Setup Overview
 1. Hardcoded Credentials (Initial Setup)

    Basic authentication setup with hardcoded credentials in application.properties.
    Suitable for testing but not secure or scalable.

2. In-Memory Authentication

    Uses UserDetailsService to define multiple users in-memory.
    Spring Security authenticates based on these in-memory credentials.

3. Custom Authentication Provider with Database Integration

    Implements a custom UserDetailsService to fetch user data from a database.
    Configures a custom AuthenticationProvider for database-driven authentication.
    Secure and scalable, allowing dynamic user management.

4. JWT Token-Based Authentication

    Stateless authentication using JWT tokens to secure API endpoints.
    On successful login, a JWT is generated and returned to the client.
    The client includes this JWT in the request headers for authenticated access to protected endpoints.
    Server validates the JWT for each request, ensuring secure communication.

## JWT Authentication Flow:
  - Login: User provides credentials, and upon authentication, the server generates a JWT.
  - Token Usage: Client sends the JWT in the request headers to access secure endpoints.
  - Token Validation: Server validates the token to allow or deny access.

## Future Improvements:
  - Implement token refresh mechanism.
  - Introduce role-based access control (RBAC).
  - Secure the API with HTTPS for sensitive data.

Please reachout to me if you have any suggestions or corrections, Happy Learning :)
