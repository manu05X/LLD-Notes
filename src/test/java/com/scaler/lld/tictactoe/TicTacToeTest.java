package com.scaler.lld.tictactoe;

import com.scaler.lld.tictactoe.models.*;
import com.scaler.lld.tictactoe.strategies.playing.RandomPlayingStrategy;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    private static final int BOARD_SIZE = 3; // Screening Case
    @Test
    public void testCreateGame(){
        Board board = new Board(3); //Magic Number == hardCoded
        Player humanPlayer = new HumanPlayer(GameSymbol.O,new User());
        Player bot = new BotPlayer(GameSymbol.X,GameLevel.EASY, new RandomPlayingStrategy());
        Game game = new Game(board, List.of(humanPlayer,bot) ,GameStatus.IN_PROGRESS);
    }
    @Test
    public void testCreateBoard(){
        Board board = new Board(3);
        int rowSize = board.getCells().get(0).size();
        assertEquals(3,rowSize,"If the constructor of board is called with n, it should create n rows");

        int columnSize = board.getCells().get(0).size();
        assertEquals(3,columnSize,"If the constructor of board is called with n, it should create n columns");
    }
}
