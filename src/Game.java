import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class Game{

    private String choice;
    private board gameboard;

    Game(){
        gameboard = new board();
    }

    private String[] getUserCardChoices(){
        //get the user card choices from the choice string and put each value as a string into an array
        //if the values are "JQK" then the array will have a length of three else the length of the array will have a length of three
        //return the array with the choices
        String[] arrayCardChoices = choice.split("");
        return arrayCardChoices;
    }

    private boolean isMoveValid(String[] choices){
        //if the user has inputted more than three choices then return false
        //calculate the total sum of the cards the user has inputted
        //if the sum of the cards is 11 the and the number of cards inputted equals 2 then the move is valid
        //if the sum of the cards is 39 and the number of cards inputted is 3 then the move is valid.
        //anything else is invalid

        if(choices.length > 3) {
            return false;
        }

        int total = 0;
        for(String choice : choices) {
            if(choice == "J" || choice == "Q" || choice == "K") {
                total = total + 13;
            } else {
                total = total + Integer.parseInt(choice);
            }
        }

        if(total  == 11 && choices.length == 2) {
            return true;
        } else if(choices.length == 3 && total == 39) {
            return true;
        }

        return false;
    }

    private boolean makeMove(){
        //get the array of user choices
        //check if the user's move is valid if invalid then return false
        //check if the gameboard contains the cards the user inputted if it doesn't then return false
        //call take cards and remove the cards from the board
        //return true after all the cards have been removed from the gameboard

        String[] userChoices = getUserCardChoices();
        if(isMoveValid(userChoices) == true){
            for(String cardValue : userChoices){
                if(gameboard.containsCard(cardValue) == false){
                    return false;
                }
            }
            for(String cardValue : userChoices) {
                gameboard.takeCard(cardValue);
            }
            return true;
        }
        return false;
    }

    public boolean play(String userChoices){
        //set the private value choice to the value of userChoices
        this.choice = userChoices;
        if(makeMove() == true){
            return true;
        } else {
            return false;
        }
    }

    public void printBoard(){
        for(int i = 0; i < gameboard.getBoard().length; i++){
            for(int n = 0; n < gameboard.getBoard()[0].length; n++){
                System.out.print(gameboard.getBoard()[i][n].getValue() + " ");
            }
            System.out.println();
        }
    }






}
