package com.example.demo.entity;

import com.example.demo.constants.CardColors;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ManaCost {
    private int blueCost;
    private int blackCost;
    private int whiteCost;
    private int greenCost;
    private int redCost;
    private int colorlessCost;
    private int convertedManaCost;
    private ArrayList<CardColors> colors;

    public ManaCost(){ }

    public ManaCost(String manaCostStr){
        convertManaCost(manaCostStr);
    }

    public int getBlueCost() {
        return blueCost;
    }

    public void setBlueCost(int blueCost) {
        this.blueCost = blueCost;
    }

    public int getBlackCost() {
        return blackCost;
    }

    public void setBlackCost(int blackCost) {
        this.blackCost = blackCost;
    }

    public int getWhiteCost() {
        return whiteCost;
    }

    public void setWhiteCost(int whiteCost) {
        this.whiteCost = whiteCost;
    }

    public int getGreenCost() {
        return greenCost;
    }

    public void setGreenCost(int greenCost) {
        this.greenCost = greenCost;
    }

    public int getRedCost() {
        return redCost;
    }

    public void setRedCost(int redCost) {
        this.redCost = redCost;
    }

    public int getColorlessCost() {
        return colorlessCost;
    }

    public void setColorlessCost(int colorlessCost) {
        this.colorlessCost = colorlessCost;
    }

    public int getConvertedManaCost(){
        return blueCost + blackCost + whiteCost + greenCost + redCost + colorlessCost;
    }

    public void convertManaCost(String manaCost){
        ArrayList<CardColors> colors = new ArrayList<CardColors>();
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
    @Override
    public String toString() {
        return "ManaCost{" +
                "blueCost=" + blueCost +
                ", blackCost=" + blackCost +
                ", whiteCost=" + whiteCost +
                ", greenCost=" + greenCost +
                ", redCost=" + redCost +
                ", colorlessCost=" + colorlessCost +
                ", convertedManaCost=" + convertedManaCost +
                '}';
    }
}
