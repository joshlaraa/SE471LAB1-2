package com.example.factory;

import com.example.product.AbstractCharacterPanel;
import com.example.product.AbstractWeaponPanel;
import com.example.product.AdvancedCharacterPanel;
import com.example.product.AdvancedWeaponPanel;

public class AdvancedFactory implements AbstractFactory {
    @Override
    public AbstractCharacterPanel createCharacterPanel() {
        return new AdvancedCharacterPanel();
    }

    @Override
    public AbstractWeaponPanel createWeaponPanel() {
        return new AdvancedWeaponPanel();
    }
}