package com.example;

import com.example.factory.AdvancedFactory;
import com.example.factory.BeginnerFactory;
import com.example.factory.IntermediateFactory;

public class Main {
    public static void main(String[] args) {
        Game game;

        game = new Game(new BeginnerFactory());
        game.play();

        game = new Game(new IntermediateFactory());
        game.play();

        game = new Game(new AdvancedFactory());
        game.play();
    }
}