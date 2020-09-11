public class Card {
    private int value;
    public Card(int value){
        create_card(value);
    }
    public int getValue(String value){
        //if A; value = 1
        //else if T; value = 10
        return this.value;
    }

    public String create_card(int value){
        //if value > 10: sudo values
            //if value == 11
                //J
            //else if value == 12
                //Q
            //else if value == 13
                //K
        //else if value == 1
            //A
        //else
            // return string.valueOf(value)
        return "";
    }

}
