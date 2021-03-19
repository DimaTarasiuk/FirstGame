package com.dtarasiuk.rockpaperscissors;

import java.util.Scanner;

class Field {

    private ESymbol firstPlayer;
    private ESymbol secondPlayer;

    public ESymbol getFirstPlayer() {
        return firstPlayer;
    }

    public void setFirstPlayer(ESymbol firstPlayer) {
        this.firstPlayer = firstPlayer;
    }

    public ESymbol getSecondPlayer() {
        return secondPlayer;
    }

    public void setSecondPlayer(ESymbol secondPlayer) {
        this.secondPlayer = secondPlayer;
    }

    @Override
    public String toString() {
        return "Field{" +
                "firstPlayer=" + firstPlayer +
                ", secondPlayer=" + secondPlayer +
                '}';
    }
}
