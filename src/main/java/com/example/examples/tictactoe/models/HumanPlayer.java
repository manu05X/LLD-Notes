package com.example.examples.tictactoe.models;

public class HumanPlayer extends Player{
    private User user;

    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }
}