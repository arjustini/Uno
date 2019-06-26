public class Game{

    private Deck gamedeck;
    private Deck discard;
    private Player[] players;
    private final int MAX_PLAYERS= 10;
    private int playerCount = 0;
    private int deckPosition = 0;

    public Game(){
        gamedeck = new Deck();
        gamedeck.initalizeDeck();
        gamedeck.shuffleDeck();
        players = new Player[MAX_PLAYERS];
    }

    public void getCurrentCard(){
        System.out.println(gamedeck.getCard(deckPosition).imagePath);
    }

    public int getDeckPosition(){
        return deckPosition;
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

    public Card flipCard() {
            Card topCard = gamedeck.getCard(deckPosition);
            deckPosition++;

            return topCard;
        }


}

