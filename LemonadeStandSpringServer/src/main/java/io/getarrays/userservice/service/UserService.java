package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Player;
import io.getarrays.userservice.domain.Player_Inventory;
import io.getarrays.userservice.domain.Role;

import java.util.List;
import java.util.Optional;

public interface UserService {

    Player savePlayer(Player player);
    Role saveRole(Role role);

    void addRoleToUser(String username, String roleName);

    Player getPlayer(String username);
    List<Player> getPlayers();



    //Player removePlayer(String username);
    //Player banPlayer(String username);

    //Player promotePlayerMembership(String username, int duration);


    void initInventory(String username);
    void updatePlayer(Long id, Player user);
    Optional<Player_Inventory> getInventory(Long id);



}
