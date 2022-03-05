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
public class Player_Inventory {


    /*
     0 = empty slot
     1 = knife
     2 = cooler
     3 = salessign
     4 = timevortex


     slot 1 - 3 are active slots

     slots 4 - 6 are the rest of the inventory up to 9?
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long balance;
    private int slot1;
    private int slot2;
    private int slot3;

    private int slot4;
    private int slot5;
    private int slot6;

}
