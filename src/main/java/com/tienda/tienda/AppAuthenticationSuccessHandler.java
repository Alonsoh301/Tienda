package com.tienda.tienda;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

public class AppAuthenticationSuccessHandler extends SimpleUrlAuthenticationFailureHandler {
    protected void handle (HttpServletRequest request, HttpServletResponse response, 
    Authentication authentication) throws IOException, ServletException{

    }
}
