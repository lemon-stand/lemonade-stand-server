package io.getarrays.userservice.repo;

import io.getarrays.userservice.domain.Player;
import io.getarrays.userservice.domain.Player_Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepo extends JpaRepository<Player_Inventory, Long> {

    //Player_Inventory getUserInventory(String username);
    //Player_Inventory postUserInventory(String username);

}
