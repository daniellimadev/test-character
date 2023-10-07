package com.ada.modulo5;

public class Archer extends Character{
    public Archer(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Archer " + getName() + ", atacar com flechada...";
    }

    @Override
    String defend() {
        return "Archer " + getName() + ", defende com flechada...";
    }
}
