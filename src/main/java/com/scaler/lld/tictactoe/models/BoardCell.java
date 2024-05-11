package com.scaler.lld.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class BoardCell {
    private int row;
    private int column;
    private GameSymbol symbol;

    public BoardCell() {

    }
}
