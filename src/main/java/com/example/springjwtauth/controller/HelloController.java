package com.example.springjwtauth.controller;

import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.example.springjwtauth.util.Constants.BEARER_AUTH;

/**
 * Created by Avinash Vijayvargiya on 30-09-2021.
 */
@RestController
public class HelloController {
    @SecurityRequirement(name = BEARER_AUTH)
    @GetMapping(value = "/hello")
    public ResponseEntity<?> greetHello() throws Exception {
        HttpHeaders responseHeaders = new HttpHeaders();
        return new ResponseEntity<>("Helloworld", responseHeaders, HttpStatus.OK);
    }
}
