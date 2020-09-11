public class Driver {
    public static void main(String[] args) {
        Deck deck = new Deck();
        for (Card c1: deck.getDeck()) {
            System.out.println(c1.getValue());
        }
    }
}
