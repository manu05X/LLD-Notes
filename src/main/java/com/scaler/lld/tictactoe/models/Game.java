package com.scaler.lld.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Getter
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private GameStatus status;

    public void start(){}
    public void makeMove() {}
    private Player checkWinner(){
        return null;
    }

    private boolean checkDraw() {
        return false;
    }
}
/*
* In order to avoid null ponter exception we alwase initialize collections
*
* */