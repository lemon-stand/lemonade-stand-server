package com.example.LemonadeStandSpringServer.player;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;


@Service
public class PlayerService {

    private final PlayerRepository playerRepository;

    @Autowired
    public PlayerService(PlayerRepository playerRepository) {
        this.playerRepository = playerRepository;
    }

    public List<Player> getPlayers() {

        return playerRepository.findAll();

    }

    public void addNewPlayer(Player player) {
        Optional<Player> playerOptional =
                playerRepository.findPlayerByEmail((player.getEmail()));
        if(playerOptional.isPresent()) {
            throw new IllegalStateException("email taken");
        }
        playerRepository.save(player);

        System.out.println(player);
    }
}
