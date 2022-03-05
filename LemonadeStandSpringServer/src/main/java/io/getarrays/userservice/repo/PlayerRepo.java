package io.getarrays.userservice.repo;

import io.getarrays.userservice.domain.Player;

import org.springframework.data.jpa.repository.JpaRepository;
import io.getarrays.userservice.domain.Player;

public interface PlayerRepo extends JpaRepository<Player, Long> {

    Player findByUsername(String username);


}
