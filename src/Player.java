public class Player {

    private Card[] hand;
    private int MAX_HAND_SIZE = 108;
    private int cardCount = 0;


    public Player() {
        hand = new Card[MAX_HAND_SIZE];

    }

    public void draw(Card card){
        hand[cardCount] = card;
        cardCount++;
    }


    public void printHand(){
     for(Card c:hand) {

         if(c != null){
             if (!c.getColor().equals(Color.NONE.getColor())) {
                 System.out.println(c);
             } else {
                 System.out.println(c.getString());
             }
         }
     }


    }
}


