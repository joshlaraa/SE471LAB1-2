package com.example;

import com.example.factory.AbstractFactory;
import com.example.product.AbstractCharacterPanel;
import com.example.product.AbstractWeaponPanel;

public class Game {
    // Factory that will create the panels
    private AbstractFactory factory;

    // Constructor that takes a factory as a parameter
    public Game(AbstractFactory factory) {
        this.factory = factory;
    }

    // This method plays the game
    public void play() {
        // Create character and weapon panels using the factory
        AbstractCharacterPanel characterPanel = factory.createCharacterPanel();
        AbstractWeaponPanel weaponPanel = factory.createWeaponPanel();

        // Display the panels
        characterPanel.display();
        weaponPanel.display();
    }
}