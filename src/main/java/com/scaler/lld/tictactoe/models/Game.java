package com.scaler.lld.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@AllArgsConstructor
@Getter
public class Game {

    private static final int PLAYER_COUNT = 2;
    private static final GameStatus DEFAULT_STATUS = GameStatus.IN_PROGRESS;

    private Board board;
    private List<Player> players = new ArrayList<>();
    private GameStatus status;

    public void start(){}
    public void makeMove() {}

    private Game(){

    }

    private Player checkWinner(){
        return null;
    }

    private boolean checkDraw() {
        return false;
    }

    public static class Builder{
        private Game game;
        public Builder(){
            game = new Game();
        }

        public Builder withSize(int size){
            this.game.board = new Board(size);
            return this;
        }

        public Builder withPlayer(Player player){
            game.getPlayers().add(player);
            return this;
        }

        public Game build(){
            boolean isValid = validate();
            if(!isValid){
                throw new RuntimeException();
            }
            Game newGame = new Game();
            newGame.board = game.board;
            newGame.players = game.getPlayers();
            newGame.status = DEFAULT_STATUS;

            return newGame;
        }

        private boolean validate(){
            if(game.players.size() != PLAYER_COUNT){
                return false;
            }

            Set<GameSymbol> symbols = game.players.stream()
                    .map(Player::getSymbol)
                    .collect(Collectors.toSet());

            if(symbols.size() != PLAYER_COUNT){
                return false;
            }
            return true;
        }


    }
}
/*
* In order to avoid null ponter exception we alwase initialize collections
*
* Builder pattern is for simplifying object construction
* */