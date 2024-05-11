package com.scaler.lld.tictactoe;

import com.scaler.lld.tictactoe.models.Board;
import com.scaler.lld.tictactoe.models.Game;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TicTacToeTest {
    @Test
    public void testCreateGame(){

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
