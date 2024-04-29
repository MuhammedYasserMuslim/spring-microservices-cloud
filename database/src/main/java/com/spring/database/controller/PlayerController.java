package com.spring.database.controller;

import com.spring.database.model.Player;
import com.spring.database.services.PlayerServices;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlayerController {


    private final PlayerServices playerServices;

    @GetMapping("/")
    public ResponseEntity<List<Player>> findAll() {
        return new ResponseEntity<>(playerServices.findAll(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Player> findById(@PathVariable("id") int id) {
        return new ResponseEntity<>(playerServices.findById(id), HttpStatus.OK);
    }

}
