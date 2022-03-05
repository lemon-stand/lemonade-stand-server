package io.getarrays.userservice.service;

import io.getarrays.userservice.domain.Player;
import io.getarrays.userservice.domain.Player_Inventory;
import io.getarrays.userservice.domain.Role;
import io.getarrays.userservice.repo.InventoryRepo;
import io.getarrays.userservice.repo.PlayerRepo;
import io.getarrays.userservice.repo.RoleRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImp implements UserService, UserDetailsService {

    private final PlayerRepo playerRepo;
    private final RoleRepo roleRepo;
    private final InventoryRepo inventoryRepo;

    private final PasswordEncoder passwordEncoder;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Player user = playerRepo.findByUsername(username);

        if(user == null) {
            log.error("User not found in the database");
            throw new UsernameNotFoundException("User not found in the database");
        } else {
            log.info("User found in the database: {}", username);
        }

        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
        user.getRoles().forEach(role -> {
            authorities.add(new SimpleGrantedAuthority(role.getName()));
        });

        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), authorities);
    }

    @Override
    public Player savePlayer(Player player) {
        log.info("Saving new user {} to the database", player.getName());
        player.setPassword(passwordEncoder.encode(player.getPassword()));
        return playerRepo.save(player);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database", role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {


        log.info("Adding role {} to user {}", roleName, username);
        Player user = playerRepo.findByUsername(username);
        Role role = roleRepo.findByName(roleName);

        user.getRoles().add(role);
    }

    @Override
    public Player getPlayer(String username) {
        log.info("Fetching user {}", username);
        return playerRepo.findByUsername(username);
    }

    @Override
    public List<Player> getPlayers() {
        log.info("Fetching all user");
        return playerRepo.findAll();
    }

    //other services implementation...



    //init stock
    @Override
    public void initInventory(String username) {

        log.info("init inventory to user {}", username);
        Player user = playerRepo.findByUsername(username);
        Player_Inventory player_inventory = new Player_Inventory(user.getPlayer_id(), (long) 1000, 0,0,0,0,0,0);


    }

    //get stock

    @Override
    public Optional<Player_Inventory> getInventory(Long id) {
        log.info("Fetching user {} inventory", id);


        return inventoryRepo.findById(id);
    }



    //save stock
    @Override
    public void updatePlayer(Long id, Player user) {


        log.info("updated inventory to user {}", user.getUsername());
        playerRepo.findById(id).equals(user);

    }







}
