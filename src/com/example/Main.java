package com.example;

import com.example.factory.AdvancedFactory;
import com.example.factory.BeginnerFactory;
import com.example.factory.IntermediateFactory;

public class Main {
    public static void main(String[] args) {
        Game game;

        // Create and play a game with beginner settings
        game = new Game(new BeginnerFactory());
        game.play();

        // Create and play a game with intermediate settings
        game = new Game(new IntermediateFactory());
        game.play();

        // Create and play a game with advanced settings
        game = new Game(new AdvancedFactory());
        game.play();
    }
}