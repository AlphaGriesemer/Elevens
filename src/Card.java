public class Card {
    private String value;
    public Card(int value){
        create_card(value);
    }
    public String getNullCard(){
        value = "#";
        return value;
    }
    public String getValue(){
        return value;
    }


    public String create_card(int value){
        if(value > 1 && value < 10){
            this.value = String.valueOf(value);
        }
        else if(value == 1){
            this.value = "A";
        }
        else if(value == 10){
            this.value = "T";
        }
        else if(value == 11){
            this.value = "J";
        }
        else if(value == 12){
            this.value = "Q";
        }
        else if(value == 13){
            this.value = "K";
        }
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
        return this.value;
    }

}
