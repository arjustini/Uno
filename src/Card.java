public class Card {
    private Value value;
    private Color color;
    String imagePath;


    //Constructor
    public Card(Value value, Color color){
        this.value = value;
        this.color = color;
    }

    //Public Methods
    public String getColor(){
        return color.getColor();
    }

    public int getNumber(){
        return value.getValue();
    }

    public String getString(){
        return value.getString();
    }



    public String toString(){
        String str = color.getColor() + " " + value.getValue();
        return str;
    }






}
