package com.spring.controller;

import com.spring.model.ServiceOne;
import com.spring.services.ServiceOneServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class ServiceOneController {


    private final ServiceOneServices servicesOneServices;

    @GetMapping("/")
    public ResponseEntity<List<ServiceOne>> findAll() {
        return new ResponseEntity<>(servicesOneServices.findAll(), HttpStatus.OK);
    }

}
