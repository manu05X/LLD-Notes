package com.scaler.lld.tictactoe.exceptions;

public class InvalidPlayersException extends RuntimeException{
    public InvalidPlayersException() {
        super("Invalid players");
    }
}
