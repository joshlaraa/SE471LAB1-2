package com.example.factory;

import com.example.product.AbstractCharacterPanel;
import com.example.product.AbstractWeaponPanel;
import com.example.product.IntermediateCharacterPanel;
import com.example.product.IntermediateWeaponPanel;

public class IntermediateFactory implements AbstractFactory {
    @Override
    public AbstractCharacterPanel createCharacterPanel() {
        return new IntermediateCharacterPanel();
    }

    @Override
    public AbstractWeaponPanel createWeaponPanel() {
        return new IntermediateWeaponPanel();
    }
}