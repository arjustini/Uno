import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Deck deck = new Deck();
        deck.shuffleDeck();
        deck.printDeck();
        System.out.println(" ");
        Player player = new Player(deck);
        player.printHand();

    }
}







