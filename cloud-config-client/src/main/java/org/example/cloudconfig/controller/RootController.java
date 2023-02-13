package org.example.cloudconfig.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RootController {
    @Value("${config.text}")
    String text;

    @GetMapping("/")
    public ResponseEntity<?> root() {
        return new ResponseEntity<>(text, HttpStatus.OK);
    }
}
