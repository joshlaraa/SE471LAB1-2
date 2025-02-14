package com.example;

import com.example.factory.AbstractFactory;
import com.example.product.AbstractCharacterPanel;
import com.example.product.AbstractWeaponPanel;

public class Game {
    private AbstractFactory factory;

    public Game(AbstractFactory factory) {
        this.factory = factory;
    }

    public void play() {
        AbstractCharacterPanel characterPanel = factory.createCharacterPanel();
        AbstractWeaponPanel weaponPanel = factory.createWeaponPanel();

        characterPanel.display();
        weaponPanel.display();
    }
}