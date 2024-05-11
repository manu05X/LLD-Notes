package com.scaler.lld.tictactoe.models;

import lombok.AllArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
public class Game {
    private Board board;
    private List<Player> players = new ArrayList<>();
    private GameStatus status;


}
/*
* In order to avoid null ponter exception we alwase initialize collections
*
* */