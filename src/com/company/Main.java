package com.company;

public class Main {
    public static void main(String[] args) {
   int highScorePosition= calculateHighScorePosition(1500);
   displayHighScorePosition(" gnan ",highScorePosition);
        highScorePosition= calculateHighScorePosition(900);
        displayHighScorePosition(" ravi ",highScorePosition);
        highScorePosition= calculateHighScorePosition(400);
        displayHighScorePosition(" sam ",highScorePosition);
        highScorePosition= calculateHighScorePosition(50);
        displayHighScorePosition(" abijith ",highScorePosition);

    }
 public static void displayHighScorePosition(String playersName, int highScorePosition ){
     System.out.println(playersName + " managed to get into position " + highScorePosition
             + " on the high score table");

 }
public static int calculateHighScorePosition(int playerScore){
        if(playerScore >= 1000){
            return 1;
        }else if(playerScore >=500 && playerScore<1000){
        return 2;
    }else if(playerScore>=100 && playerScore <500){
            return 3;
        }else{
            return 4;
        }

    }
}


