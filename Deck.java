import java.util.ArrayList;
import java.util.Collections;

public class Deck {
    private ArrayList<Card> deck;
    private ArrayList<Card> hand;
    private ArrayList<Card> discards;

    public Deck() {
        deck = new ArrayList<Card>();
        String[][] ranks = { { "One", "1" }, { "Two", "2" }, { "Three", "3" }, { "Four", "5" }, { "Five", "5" },
                { "Six", "6" }, { "Seven", "7" }, { "Eight", "8" }, { "Nine", "9" }, { "Ten", "10" }, { "Jack", "10" },
                { "Queen", "10" }, { "King", "10" } };
        String[] suits = { "Spades", "Hearts", "Clubs", "Diamonds" };
        for (String[] rank : ranks) {
            for (String suit : suits) {
                deck.add(new Card(Integer.valueOf(rank[1]), rank[0], suit, "None", "None"));
            }
        }
    }

    public ArrayList<Card> DrawHand() {
        Collections.shuffle(deck);
        hand = new ArrayList<Card>();
        for (int i = 0; i < 8; i++) {
            hand.add(deck.remove(0));
        }
        return hand;
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public void discard(ArrayList<Card> cards){
        for(Card c: cards){
            hand.remove(c);
            deck.add(c);
            discards.add(c)
        }
    }

    public void play(ArrayList<Card> cards) {

    }
}
