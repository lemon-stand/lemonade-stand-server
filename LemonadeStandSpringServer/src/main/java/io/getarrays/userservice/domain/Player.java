package io.getarrays.userservice.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ManyToAny;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    private String email;
    private String username;
    private String password;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<Role> roles = new ArrayList<>();

    public Long getPlayer_id() {
        return id;
    }

    private long balance;
    private long lemons;
    private long shiny_lemons;
    private long sugar;
    private long honey;
    private long water;









    //private Collection<Player_Inventory> player_inventory = new ArrayList<>();
    //private Collection<Player_Stock> player_stock = new ArrayList<>();
    //private Collection<Player_Trades> player_trades = new ArrayList<>();

    //private date dob;

    //private date usercreationdate





}
