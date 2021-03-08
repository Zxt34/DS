package Poker;

public class Card {
    public String suit;
    public String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "(" + this.suit + this.rank + ")";
    }
}
