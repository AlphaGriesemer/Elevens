public class board {
    private Card[][] gameboard = new Card[3][3];

    //constructor
    board(){
        // fill gameboard with first 9 cards on deck
    }

    private void refreshBoard(){
        //look for empty spaces on the board and fill them with new values from the card deck
        //if there are no cards left in the deck then fill the space with a NULL card values
    }

    private boolean containsCard(Card cardValue){
        //if the gameboard contains the card then return true
        //else return false
    }

    public boolean takeCards(Card cardValOne, Card cardValTwo, Card cardValThree){
        //if the board has the card values inputted then remove the card values from the board and call refresh board
        //and return true

        //if the board does not have the card values inputted then return false
    }

    public Card[][] getBoard() {
        //return the gameboard
    }



}
