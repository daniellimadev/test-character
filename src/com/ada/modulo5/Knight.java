package com.ada.modulo5;

public class Knight extends Character{
    public Knight(String name) {
        super(name);
    }

    @Override
    String attack() {
        return "Knight " + getName() + " atacar com espada...";
    }

    @Override
    String defend() {
        return "Knight " + getName() + " defende com escudo...";
    }
}
