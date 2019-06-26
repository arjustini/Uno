import java.util.Scanner;

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

                 if(c.getNumber() == (Value.REVERSE.getValue())){
                     System.out.println(c.getColor() + " " + Value.REVERSE.getString());
                 }

                 else if(c.getNumber() == (Value.SKIP.getValue())){
                     System.out.println(c.getColor() + " " + Value.SKIP.getString());
                 }

                 else if (c.getNumber() == (Value.PLUSTWO.getValue())){
                     System.out.println(c.getColor() + " " + Value.PLUSTWO.getString());
                 }

                 else{
                 System.out.println(c);}





             }
             else {
                 System.out.println(c.getString());
             }
         }
     }


    }

    public void playCard() {
        System.out.println("Enter your card: ");
        Scanner scanner = new Scanner(System.in);
        String card = scanner.nextLine();
        System.out.println("Your card is " + card);

    }

}


