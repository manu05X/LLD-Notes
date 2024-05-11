package com.scaler.lld.tictactoe.models;


import com.scaler.lld.tictactoe.strategies.playing.PlayingStrategy;

public class BotPlayer extends Player{
    private GameLevel level;

    private PlayingStrategy playingStrategy;

    public BotPlayer(GameSymbol symbol, GameLevel level, PlayingStrategy playingStrategy){
        super(symbol);
        this.level = level;
        this.playingStrategy = playingStrategy;
    }

    @Override
    public BoardCell play(Board board){
        return playingStrategy.makeMove(board);
    }

}
