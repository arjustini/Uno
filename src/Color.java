public enum Color {
    RED("Red"),
    GREEN("Green"),
    YELLOW("Yellow"),
    BLUE("Blue"),
    NONE("None");

    private final String color;

    //Constructor
    private Color(String color){
        this.color= color;
    }

    //public methods
    public String getColor(){
        return color;
    }


}
