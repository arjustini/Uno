public class Player extends Deck {

    private Card[] hand;

    public Player(Deck deck) {

        hand = deck.deal();

    }


    public void printHand(){
     for(Card c:hand) {
         if (!c.getColor().equals(Color.NONE.getColor())) {
             System.out.println(c);
         } else {
             System.out.println(c.getString());
         }
     }


    }
}


