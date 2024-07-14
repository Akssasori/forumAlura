package com.aline.forum.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/teste")
@RestController
public class TestController {

    @GetMapping
    public ResponseEntity<String> test() {
        System.out.printf("entrei");
        return ResponseEntity.ok().body("entrei");
    }
}
