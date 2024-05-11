package com.scaler.lld.tictactoe.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public abstract class Player {
    private GameSymbol symbol;

    public abstract BoardCell play(Board board);
}
