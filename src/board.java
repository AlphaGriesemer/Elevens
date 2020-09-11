import java.util.Stack;

public class board {
    private Card[][] gameboard = new Card[3][3];
    private Deck cardDeck;


    //constructor
    board(){
        // fill gameboard with first 9 cards on deck
        cardDeck = new Deck();
        for(int i = 0; i < 3; i++) {
            for (int n = 0; n < 3; n++) {
                this.gameboard[i][n] = this.cardDeck.getCard();
            }
        }
    }

    public boolean containsCard(String cardValue) {
        for(int i = 0; i < this.gameboard.length; i++){
            for(int n = 0; n < this.gameboard[0].length; n++){
                if(this.gameboard[i][n].getValue() == cardValue){
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

        if(this.containsCard(cardValue) == false){
            return false;
        }

        for(int i = 0; i < gameboard.length; i++){
            for(int n = 0; n < gameboard[0].length; n++){
                if(gameboard[i][n].getValue() == cardValue){
                    if(cardDeck.getNumOfCardLeft() > 0){
                        gameboard[i][n] = cardDeck.getCard();
                        return true;
                    } else {
                        gameboard[i][n] = null;
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean isPLayable(){
        //checks if the gameboard has any elevens left
        return false;
    }

    public Card[][] getBoard() {
        //return the gameboard
        return gameboard;
    }



}
