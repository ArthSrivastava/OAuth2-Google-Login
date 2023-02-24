package com.oauth2authentication.oauth2google;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class TestController {

    @GetMapping("/")
    public String printHello() {
        return "OAuth2 Google login test!";
    }

    @GetMapping("/user")
    public String getUser(Principal principal) {
        return principal.getName();
    }
}
