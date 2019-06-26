public enum Color {
    RED("Red", "red"),
    GREEN("Green", "green"),
    YELLOW("Yellow", "yellow"),
    BLUE("Blue", "blue"),
    NONE("None", "none");

    private final String color;
    private final String imgPrefix;

    //Constructor
    private Color(String color, String imgPrefix){
        this.color= color;
        this.imgPrefix = imgPrefix;
    }

    //public methods
    public String getColor(){
        return color;
    }
    public String getImgPrefix() {return imgPrefix;}

}
