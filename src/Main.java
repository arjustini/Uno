import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

       Game game = new Game();
       Player player1 = new Player();
       Player player2 = new Player();
       Player player3 = new Player();
       game.addPlayer(player1);
       game.addPlayer(player2);
       game.addPlayer(player3);


       game.dealPlayersIn();

       System.out.println(" ");
       player1.printHand();

       System.out.println(" ");
       player2.printHand();

       System.out.println(" ");
       player3.printHand();



    }
}




/*
Green 9
Red 10
Blue 2
Green 1
Green 7
Blue 10
Green 12
Yellow 12
Green 3
Red 6
Blue 0
Wild
Yellow 5
Yellow 6






 */

