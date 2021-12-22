package com.example.LemonadeStandSpringServer.player;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PlayerRepository
        extends JpaRepository<Player, Long> {


    //select * ffrom player email = ?
        @Query("Select s From Player s WHERE s.email = ?1")
        Optional<Player> findPlayerByEmail(String email);




}
