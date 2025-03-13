package com.example.demo.entity;

import com.example.demo.constants.CardColors;
import com.example.demo.constants.CardTypes;
import jakarta.persistence.*;
//import org.springframework.data.annotation.Id;

import java.util.*;

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
    private String manaCostStr;
    private String typeStr;
    private Integer convertedManaCost;
    private ArrayList<CardColors> colors;
    private ArrayList<CardTypes> types;

    public MagicCard(){
        this.cardId = UUID.randomUUID();
    }

    public MagicCard(String name, String text, String manaCost, String typesInput) {
        this.name = name;
        this.cardText = text;
        this.manaCostStr = manaCost.toUpperCase();
        this.colors = new ArrayList<CardColors>();
        this.types = new ArrayList<CardTypes>();
        this.convertedManaCost = 0;
        this.typeStr = typesInput;
        convertManaCost(manaCost);
        convertTypes(typeStr);
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
        return manaCostStr;
    }

    public void setManaCost(String manaCost) {
        this.manaCostStr = manaCost;
    }

    public void convertManaCost(String manaCost){
        colors.add(manaCost.contains("B") ? CardColors.BLACK:null);
        colors.add(manaCost.contains("U") ? CardColors.BLUE:null);
        colors.add(manaCost.contains("W") ? CardColors.WHITE:null);
        colors.add(manaCost.contains("G") ? CardColors.GREEN:null);
        colors.add(manaCost.contains("R") ? CardColors.RED:null);
        colors.add(manaCost.contains("C") ? CardColors.COLORLESS:null);
        colors.removeAll(Collections.singleton(null));
        List<String> tokenizedCost = Arrays.asList(manaCost.split(","));
        for (String token : tokenizedCost){
            System.out.println(token);
            convertedManaCost += Integer.parseInt(token.replaceAll("[A-Z]",""));
        }
    }

    public void convertTypes(String typeInput){
        typeStr = typeInput.toUpperCase();
        List<String> tokenizedTypes = Arrays.asList(typeStr.split(" "));
        for (String t : tokenizedTypes){
            CardTypes ct = CardTypes.valueOf(t);
            types.add(ct);
        }
    }

    @Override
    public String toString() {
        return "MagicCard{" +
                "cardId=" + cardId +
                ", name='" + name + '\'' +
                ", cardText='" + cardText + '\'' +
                ", manaCostStr='" + manaCostStr + '\'' +
                ", convertedManaCost=" + convertedManaCost +
                ", colors=" + colors +
                ", types=" + types +
                '}';
    }
}
