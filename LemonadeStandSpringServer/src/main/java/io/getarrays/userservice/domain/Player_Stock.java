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
public class Player_Stock {


   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   private Long id;
   private Long basic_lemons_bal;
   private Long shiny_lemons_bal;
   private Long sugar_bal;
   private Long water_bal;

}
