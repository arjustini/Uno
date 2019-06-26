

public class Deck  {

    private Card[] deck;
    private int cardCount = 0;
    private final int DECK_SIZE = 108;
    private final int HAND_SIZE = 7;





    //Constructor
    public Deck() {
        deck = new Card[DECK_SIZE];

    }

     public void initalizeDeck(){   //4 plus four cards
        for(int i = 0; i <= 3; i++){
            deck[cardCount] = new Card(Value.PLUSFOUR, Color.NONE);
            deck[cardCount].imagePath = Value.PLUSFOUR.getImgExt();
            cardCount++;
        }

        //4 wild cards
        for(int i = 0; i <= 3; i++){
            deck[cardCount] = new Card(Value.WILD, Color.NONE);
            deck[cardCount].imagePath = Value.WILD.getImgExt();;
            cardCount++;
        }


        makeEight(Value.PLUSTWO);
        makeEight(Value.REVERSE);
        makeEight(Value.SKIP);
        makeEight(Value.NINE);
        makeEight(Value.EIGHT);
        makeEight(Value.SEVEN);
        makeEight(Value.SIX);
        makeEight(Value.FIVE);
        makeEight(Value.FOUR);
        makeEight(Value.THREE);
        makeEight(Value.TWO);
        makeEight(Value.ONE);



        //4 zero cards
        for (Color color : Color.values()) {
            if(!color.equals(Color.NONE)){
                deck[cardCount] = new Card(Value.ZERO, color);
                deck[cardCount].imagePath = color.getImgPrefix() + Value.ZERO.getImgExt();
                cardCount++;
            }

        }



        }

    public Card getCard(int i){
        return deck[i];
    }

    public void setCard(Card card, int i){
        deck[i] = card;
    }

    //public method
    public void shuffleDeck(){
        for (int i = 107 ; i >0; i--){
            int rand = (int) (Math.random()*(i+1));
            Card temp = deck[i];
            deck[i] = deck[rand];
            deck[rand]=temp;

        }
    }


    public Card deal(int deckPosition){
        return deck[deckPosition];
    }



    public void printDeck(){
        for(Card c:deck) {
            if(!c.getColor().equals(Color.NONE.getColor())){
            System.out.println(c);
            }
            else{
                System.out.println(c.getString());
            }



         }
    }

    //private method
    private void makeEight(Value value){
        for(int i = 0; i <= 1; i++){
            for (Color color : Color.values()) {
                if(!color.equals(Color.NONE)){
                    deck[cardCount] = new Card(value, color);
                    deck[cardCount].imagePath = color.getImgPrefix() + value.getImgExt();
                    cardCount++;
                }

            }
        }
    }


}
