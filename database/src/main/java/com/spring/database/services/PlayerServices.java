package com.spring.database.services;

import com.spring.database.model.Player;
import com.spring.database.repository.PlayerRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlayerServices {

    private final PlayerRepository playerRepository;


    public List<Player> findAll() {
        return playerRepository.findAll();
    }

    public Player findById(int id) {
        return playerRepository.findById(id).orElse(null);
    }
}
