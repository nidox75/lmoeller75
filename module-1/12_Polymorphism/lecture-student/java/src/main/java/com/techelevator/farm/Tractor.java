package com.techelevator.farm;

public class Tractor implements Singable {

    private String name;
    private String sound;

    public Tractor() {
        this.name = "Tractor";
        this.sound = "M00!";
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getSound() {
        return this.sound;
    }

    @Override
    public String getIndefiniteArticleForSound() {
        return "a";
    }
}
