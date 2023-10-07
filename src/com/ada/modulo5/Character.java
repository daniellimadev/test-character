package com.ada.modulo5;

public abstract class Character {

    private String name;

    public Character(String name) {
        this.name = name;
    }

    abstract String attack();
    abstract String defend();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
