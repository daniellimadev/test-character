package com.ada.modulo5;

public class Mage extends Character{
    public Mage(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Mage " + getName() + " atacar com Magia...";
    }

    @Override
    String defend() {
        return "Mage " + getName() + " defende com Magia...";
    }
}
