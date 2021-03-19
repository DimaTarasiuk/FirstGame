package com.dtarasiuk.rockpaperscissors;

import java.util.Random;
import java.util.Scanner;

public class GameLogic {
    Field field = new Field();
    Scanner scanner = new Scanner(System.in);

    private ESymbol getUserInput(){
        ESymbol playerInput = ESymbol.valueOf(scanner.nextLine());
        return playerInput;
    }

    //todo вылетает если lowerCase input
    private String inputValidation(){
        String userInput = getUserInput().toString();
        if(userInput != null){
            return userInput.toUpperCase();
        }else{
            return null;
        }
    }

    private ESymbol generatePCsymbol(){
        int randPCsymbol = new Random().nextInt(ESymbol.values().length);
        return ESymbol.values()[randPCsymbol];
    }

    private void checkWinner(){
        ESymbol firstUser = field.getFirstPlayer();
        ESymbol secondUser = generatePCsymbol();

        if (firstUser.equals(secondUser)){
            System.out.println("no body won let's play once again");
            checkWinner();
        }else if(firstUser == ESymbol.PAPER && secondUser == ESymbol.STONE){
            System.out.println("first user won with " + ESymbol.PAPER + " symbol");
        }else if(firstUser == ESymbol.SCISSORS && secondUser == ESymbol.STONE){
            System.out.println("second User won with " + ESymbol.STONE + " symbol");
        }else if(firstUser == ESymbol.STONE && secondUser == ESymbol.PAPER){
            System.out.println("second user won with symbol" + ESymbol.PAPER );
        }else if(firstUser == ESymbol.PAPER && secondUser == ESymbol.SCISSORS){
            System.out.println("second user won with " + ESymbol.SCISSORS + " symbol");
        }else if(firstUser.equals(ESymbol.SCISSORS) && secondUser.equals(ESymbol.PAPER) ){
            System.out.println("first user won with " + ESymbol.SCISSORS + " symbol");
        }else {
            System.out.println("no such combination " + firstUser + " " + secondUser);
        }
    }

    public void start() {

        ESymbol firstPlayer = getUserInput();
        //ESymbol secondPlayer = getUserInput();
        field.setFirstPlayer(firstPlayer);
        //field.setSecondPlayer(secondPlayer);
        checkWinner();
    }


}


