public class Game{

    private Deck gamedeck;
    private Player[] players;
    private final int MAX_PLAYERS= 10;
    private int playerCount = 0;
    private int deckPosition = 0;


    public Game(){
        // initialize deck and shuffle
        gamedeck = new Deck();
        gamedeck.shuffleDeck();
       gamedeck.printDeck();

        players = new Player[MAX_PLAYERS];
    }

    public void dealPlayersIn() {
        while (deckPosition < playerCount * 7) {
            for (int i = 0; i < playerCount; i++) {
                players[i].draw(gamedeck.getCard(deckPosition));
                deckPosition += 1;
            }
        }
    }

    public void addPlayer(Player player){
        players[playerCount] = player;
        playerCount +=1;


    }

}

