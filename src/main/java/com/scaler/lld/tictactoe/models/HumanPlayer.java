package com.scaler.lld.tictactoe.models;

public class HumanPlayer extends Player{
    private User user;

    public HumanPlayer(GameSymbol symbol, User user) {
        super(symbol);
        this.user = user;
    }

    public BoardCell play(Board board) {
        return null;
    }
}
