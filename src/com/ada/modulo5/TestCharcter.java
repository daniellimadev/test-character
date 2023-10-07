package com.ada.modulo5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class TestCharcter {

    @Test
    public void testArcher() {
        Archer archer = new Archer("Gavião Arqueiro");
        Assertions.assertEquals(archer.attack(),"Archer Gavião Arqueiro, atacar com flechada...");
    }

    @Test
    public void testMage() {
        Mage mage = new Mage("Harry");
        Assertions.assertEquals(mage.attack(),"Mage Harry atacar com Magia...");
    }

    @Test
    public void testKnight() {
        Knight knight = new Knight("Damian");
        Assertions.assertEquals(knight.attack(),"Knight Damian atacar com espada...");

    }

}
