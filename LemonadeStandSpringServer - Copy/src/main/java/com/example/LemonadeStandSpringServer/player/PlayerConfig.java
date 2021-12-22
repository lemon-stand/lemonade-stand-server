package com.example.LemonadeStandSpringServer.player;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class PlayerConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            PlayerRepository repository) {
        return args -> {
            Player rick = new Player(
            1L,
            "Rick",
            LocalDate.of(2000, Month.JANUARY, 5),
            "Rick@morty.com"
            );

            Player alexis = new Player(
                    "alexis",
                    LocalDate.of(2004, Month.SEPTEMBER, 21),
                    "alexis@gmail.com"
            );

            repository.saveAll(
                    List.of(rick, alexis)
            );
        };

    }

}
