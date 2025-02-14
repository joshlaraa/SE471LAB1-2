package com.example.factory;

import com.example.product.AbstractCharacterPanel;
import com.example.product.AbstractWeaponPanel;
import com.example.product.BeginnerCharacterPanel;
import com.example.product.BeginnerWeaponPanel;

public class BeginnerFactory implements AbstractFactory {
    @Override
    public AbstractCharacterPanel createCharacterPanel() {
        return new BeginnerCharacterPanel();
    }

    @Override
    public AbstractWeaponPanel createWeaponPanel() {
        return new BeginnerWeaponPanel();
    }
}