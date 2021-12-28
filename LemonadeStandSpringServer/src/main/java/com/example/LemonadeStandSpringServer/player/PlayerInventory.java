package com.example.LemonadeStandSpringServer.player;
import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.lang.reflect.Constructor;
import java.time.LocalDate;


    @Entity
    @Table
    public class PlayerInventory {
        @Id
        @SequenceGenerator(
                name = "player_inventory_sequence",
                sequenceName = "player_inventory_sequence",
                allocationSize = 1
        )
        @GeneratedValue(
                strategy = GenerationType.SEQUENCE,
                generator = "player_inventory_sequence"
        )
        private Long id; // to connect inventory to user
        private Long balance;    // player balance
        private Long num_basic_lemons; // basic lemons
        private Long num_shiny_lemons; // shiny lemons
        private Long num_sugar; // farm sugar cane from shop
        private Long num_honey; //farm honey with bees
        private Long num_water;
        private Long num_ice;
        //private String quickinventory;


// class for recipe

// recipes and other recipes

// class for pricing

// class for trade offers

// class for market orders
//big ass server code
//

        // attributes for lemons
        //atributes for water
        //atributes for stock
        //attributes for types of lemons/ingredients

        public PlayerInventory() {


        }

//this implementation does not scale with breeding lemons - maybe with a string

        public PlayerInventory(long _id, long _balance,
                                long _num_basic_lemons, long _num_shiny_lemons,
                                long _num_sugar, long _num_honey, long _num_water,
                                long _num_ice) {

            this.id = _id;
            this.balance = _balance;
            this.num_basic_lemons = _num_basic_lemons;
            this.num_shiny_lemons = _num_shiny_lemons;
            this.num_sugar = _num_sugar;
            this.num_honey = _num_honey;
            this.num_water = _num_water;
            this.num_ice =  _num_ice;

        }

        public PlayerInventory(long _id, long _balance) {
            this.id = _id;
            this.balance = _balance;

        }

        public Long getId() {
            return id;
        }

        public void setId(long _id) {
            this.id = _id;
        }

        public Long getBalance() {
            return balance;
        }

        public void setBalance(Long _balance) {
            this.balance = _balance;
        }


        // get and setters for all the variables

        //rest methods for the inventory tuple


        @Override
        public String toString(){
            return "Player {" +
                    "id=" + id +
                    ", balance='" + balance + '\''+
                    ",null="+ 0 +
                    '}';
        }

        //
        //      make sure that architure project sturucture somewhat works
        //




    }


