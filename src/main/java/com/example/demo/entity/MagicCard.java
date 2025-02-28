package com.example.demo.entity;

import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

import java.util.UUID;

@Entity
@Table(name="cards")
public class MagicCard {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column (name="cardId", nullable=false, unique = true)
    private UUID cardId;
    private String name;
    private String cardText;
    //private ManaCost manaCost;
    private String manaCost;
//    private CardColors[] colors;
}
