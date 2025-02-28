package com.example.demo.entity;

public class ManaCost {
    private int blueCost;
    private int blackCost;
    private int whiteCost;
    private int greenCost;
    private int redCost;
    private int colorlessCost;
    private int convertedManaCost;

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
