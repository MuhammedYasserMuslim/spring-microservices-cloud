package com.spring.api.controller;


import com.spring.api.model.Player;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
public class PlayerController {

    @GetMapping("{id}")
    public Player index(@PathVariable("id") int id) {

        Map<String, String> map = new HashMap<>();
        map.put("id", "id");

        ResponseEntity<Player> response = new RestTemplate().getForEntity("http://localhost:6363/{id}", Player.class, map);

        return response.getBody();
    }
}
