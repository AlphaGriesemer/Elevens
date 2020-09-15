import java.util.Collections;
import java.util.Stack;

public class Deck {
    private Stack<Card> deck = new Stack<>();
    public Deck() {
        for (int i = 1; i < 14; i++){
            for (int j = 0; j < 4; j++){
                Card c1 = new Card(i);
                deck.add(c1);
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
        if(deck.size() < 1){
            Card c1 = new Card();
            deck.push(c1);
        }
        return deck.pop();
    }

}
