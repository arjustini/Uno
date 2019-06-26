public enum Value {
    ZERO(0, "Zero", "_0.png"),ONE(1,"One", "_1.png"),TWO(2,"Two", "_2.png"),
    THREE(3, "Three","_3.png" ),FOUR(4, "Four", "_4.png"),FIVE(5,"Five", "_5.png")
    ,SIX(6,"Six", "_6.png"),SEVEN(7, "Seven", "_7.png"),EIGHT(8, "Eight", "_8.png")
    ,NINE(9, "Nine", "_9.png"),SKIP(10, "Skip", "_skip.png"),REVERSE(11, "Reverse", "_reverse.png"),
    PLUSTWO(12, "Plus Two", "_picker.png")
    ,WILD(13, "Wild", "wild_color_changer.png"), PLUSFOUR(14, "Plus Four", "wild_pick_four.png");

    private final int number;
    private final String str;
    private final String imageExt;

    //Constructor
    private Value(int number, String str, String imageExt){
        this.number = number;
        this.str = str;
        this.imageExt = imageExt;
    }


    //PublicMethod
    public int getValue(){
        return number;
    }
    public String getString() {return str;}
    public String getImgExt() {return imageExt;}
}
