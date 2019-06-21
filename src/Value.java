public enum Value {
    ZERO(0, "Zero"),ONE(1,"One"),TWO(2,"Two"),
    THREE(3, "Three"),FOUR(4, "Four"),FIVE(5,"Five")
    ,SIX(6,"Six"),SEVEN(7, "Seven"),EIGHT(8, "Eight")
    ,NINE(9, "Nine"),SKIP(10, "Ten"),REVERSE(11, "Reverse"), PLUSTWO(12, "Plus Two")
    ,WILD(13, "Wild"),PLUSFOUR(14, "Plus Four");

    private final int number;
    private final String str;

    //Constructor
    private Value(int number, String str){
        this.number = number;
        this.str = str;
    }


    //PublicMethod
    public int getValue(){
        return number;
    }
    public String getString() {return str;}
}
