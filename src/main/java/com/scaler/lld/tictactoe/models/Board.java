package com.scaler.lld.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@Setter
@Getter
public class Board {
    private int size;
    private List<List<BoardCell>> cells = new ArrayList<>();
    
    public Board(int size) {
        this.size = size;
        this.cells = initializeCells(size);
    }

    private List<List<BoardCell>> initializeCells(int size) {
        //Arrays.fill();
        //List<String> names = Collections.nCopies(5,"Tantia");
        //["Tantia","Tantia","Tantia","Tantia","Tantia"]

        //Create first row
        List<BoardCell> firstRow = Collections.nCopies(size, new BoardCell());

        //List<List<BoardCell>> rows = Collections.nCopies(size, firstRow);
        return Collections.nCopies(size, firstRow);
    }
}
