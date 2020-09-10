import java.util.ArrayList;

public class Deck {
    private ArrayList<Card> deck = new ArrayList<>();
    public Deck(){

    }
    public int getNumOfCardLeft(){
        return deck.size();
    }
}
