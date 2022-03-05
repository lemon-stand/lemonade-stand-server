package io.getarrays.userservice.domain;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Player_Trades {

    /*
    need to create a trade and offer class
    that holds the information for the data tuple
     */

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String trade_slot1;
    private String trade_slot2;
    private String trade_slot3;

    private String offer_slot1;
    private String offer_slot2;
    private String offer_slot3;
}
