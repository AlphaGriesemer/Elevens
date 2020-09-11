import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> deck = new Stack<>();
    public Deck() {
        for (int i = 0; i < 13; i++){
            for (int j = 0; j < 4; j++){
                Card c1 = new Card(i);
            }
        }
        Collections.shuffle(deck);
    }
    public int getNumOfCardLeft(){
        return deck.size();
    }
    public Stack<Card> getDeck(){
        return deck;
    }
    public Card getCard(){
        return deck.pop();
    }

}
