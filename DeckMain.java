import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private final String rank;
    private final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Card card = (Card) obj;
        return rank.equals(card.rank) && suit.equals(card.suit);
    }

    @Override
    public int hashCode() {
        return rank.hashCode() * 31 + suit.hashCode();
    }
}

class Deck {
    private final List<Card> cards;
    private final List<Card> discardPile;

    public Deck() {
        cards = new ArrayList<>();
        discardPile = new ArrayList<>();
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(new Card(rank, suit));
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card dealCard() {
        if (cards.isEmpty()) {
            throw new IllegalStateException("Deck is empty, no cards to deal.");
        }
        Card card = cards.remove(cards.size() - 1);
        discardPile.add(card);
        return card;
    }

    public void returnCard(Card card) {
        if (cards.contains(card)) {
            throw new IllegalArgumentException("Card " + card + " is already in the deck.");
        }
        cards.add(card);
        discardPile.remove(card);
    }

    public int size() {
        return cards.size();
    }

    @Override
    public String toString() {
        return "Deck with " + cards.size() + " cards.";
    }
}

public class DeckMain {
    public static void main(String[] args) {
        Deck deck = new Deck();
        System.out.println(deck);
        
        deck.shuffle();
        System.out.println("Deck shuffled.");
        
        Card dealtCard = deck.dealCard();
        System.out.println("Dealt card: " + dealtCard);
        System.out.println("Remaining cards in deck: " + deck.size());
        
        deck.returnCard(dealtCard);
        System.out.println("Card returned to deck: " + dealtCard);
        System.out.println("Remaining cards in deck: " + deck.size());
    }
}
