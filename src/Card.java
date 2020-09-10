import java.util.Random;
public class Card {
    private int value;
    Random random = new Random();
    public Card(){
        create_card();
    }
    public int getValue(String value){
        //if A; value = 1
        //else if T; value = 10
        return this.value;
    }

    public String create_card(){
        //int value = random.nextInt(14);
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
