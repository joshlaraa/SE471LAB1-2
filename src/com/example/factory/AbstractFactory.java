package com.example.factory;

import com.example.product.AbstractCharacterPanel;
import com.example.product.AbstractWeaponPanel;

public interface AbstractFactory {
    AbstractCharacterPanel createCharacterPanel();
    AbstractWeaponPanel createWeaponPanel();
}