package com.spring.controller;

import com.spring.model.ServiceTwo;
import com.spring.services.ServiceTwoServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ServiceTwoController {

    private final ServiceTwoServices serviceTwoServices;

    @GetMapping("/")
    public ResponseEntity<List<ServiceTwo>> findAll() {
        return new ResponseEntity<>(serviceTwoServices.findAll(), HttpStatus.OK);
    }
}
