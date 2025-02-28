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

    public MagicCard(){
        this.cardId = UUID.randomUUID();
    }

    public MagicCard(String name, String text, String manaCost) {
        this.name = name;
        this.cardText = text;
        this.manaCost = manaCost;
    }

    public UUID getCardId() {
        return cardId;
    }

    public void setCardId(UUID cardId) {
        this.cardId = cardId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    @Override
    public String toString() {
        return "MagicCard{" +
                "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", cardText='" + cardText + '\'' +
                ", manaCost='" + manaCost + '\'' +
                '}';
    }
}
