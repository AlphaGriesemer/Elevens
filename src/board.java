import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Stack;
import java.util.function.Predicate;

public class board {
    private Card[][] gameboard = new Card[3][3];
    private Deck cardDeck;


    //constructor
    board(){
        // fills gameboard with first 9 cards on deck
        // creates a new card deck
        cardDeck = new Deck();
        for(int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                this.gameboard[i][n] = this.cardDeck.getCard();
            }
        }
    }

    public boolean containsCard(String cardValue) {
        //checks if the gameboard has a the card value
        //if the gameboard has the cardValue return true
        //if the gameboard doesn't have the card value return false
        for(int i = 0; i < gameboard.length; i++){
            for(int n = 0; n < gameboard[0].length; n++){
                if(gameboard[i][n].equals(null)){
                    continue;
                }
                if(gameboard[i][n].getValue().equals(cardValue)){
                    return true;
                }
            }
        }
        return false;
    }

    public boolean takeCard(String cardValue){
        //if the board does not have the card return false
        //find the placement of the card on the gameboard thats value is equal to the card value of the card that needs to be removed
        //set the card on the gameboard to a new card if the deck still has cards
        //if the deck is empty set the value of the space on the gameboard to null
        //return true to end loops and confirm that the card has been placed.

        if(!this.containsCard(cardValue)){
            return false;
        }

        for(int i = 0; i < gameboard.length; i++){
            for(int n = 0; n < gameboard[0].length; n++){
                if(gameboard[i][n].getValue().equals(cardValue)){
                    if(cardDeck.getNumOfCardLeft() > 0){
                        System.out.println(cardDeck.getDeck().peek().getValue());
                        gameboard[i][n] = cardDeck.getCard();
                        return true;
                    } else {
                        gameboard[i][n] = cardDeck.getCard();
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isPLayable(){
        //checks if the gameboard has any elevens left
        if(this.containsCard("K") && this.containsCard("Q") && this.containsCard("J")){
            return true;
        }
        for(Card[] row : gameboard){
            for(Card card : row){
                if(card.getValue().equals("K") || card.getValue().equals("Q") || card.getValue().equals("J")){
                    continue;
                } else if(card.getValue().equals("T")){
                    if(this.containsCard("A")){
                        return true;
                    }
                } else if (card.getValue().equals("A")){
                    if(this.containsCard("T")){
                        return true;
                    }
                } else if(!card.getValue().equals("#") && this.containsCard(String.valueOf(11 - Integer.valueOf(card.getValue())))){
                    return true;
                }
            }
        }

        return false;
    }

    public Card[][] getBoard() {
        //return the gameboard
        return gameboard;
    }



}
