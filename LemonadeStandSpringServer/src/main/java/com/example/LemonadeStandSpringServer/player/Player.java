package com.example.LemonadeStandSpringServer.player;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.lang.reflect.Constructor;
import java.time.LocalDate;

@Entity
@Table
public class Player {
    @Id
    @SequenceGenerator(
            name = "player_sequence",
            sequenceName = "player_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "player_sequence"
    )
    private Long id;
    private String name;    //username, pass??
    private LocalDate dob; //maybe not needed
    private String email;


    // attributes for lemons
    //atributes for water
    //atributes for stock
    //attributes for types of lemons/ingredients

    public Player() {


    }

    public Player(long _id, String _name, LocalDate _dob, String _email) {
        this.id = _id;
        this.name = _name;
        this.dob = _dob;
        this.email = _email;

    }

    public Player(String _name, LocalDate _dob, String _email) {
        this.name = _name;
        this.dob = _dob;
        this.email = _email;

    }

     public Long getId() {
            return id;
     }

     public void setId(long _id) {
            this.id = _id;
     }

     public String getName() {
        return name;
     }

     public void setName(String _name) {
        this.name = _name;
     }
    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate _dob) {
        this.dob = _dob;
    }

     public String getEmail() {
        return email;
     }

     public void setEmail(String _email){
        this.email = _email;
     }

     @Override
    public String toString(){
        return "Player {" +
                "id=" + id +
                ", name='" + name + '\''+
                ",dob="+ dob +
                ", age=" + email +
                '}';
     }




}
