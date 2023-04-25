package ca.sheridancollege.project;

import java.util.ArrayList;

public class GoFishDeck extends GroupOfCards {
    public GoFishDeck() {
        super(52);
        ArrayList<Card> cards = new ArrayList<>();
        for (GoFishCard.Suit suit : GoFishCard.Suit.values()) {
            for (GoFishCard.Value value : GoFishCard.Value.values()) {
                cards.add(new GoFishCard(suit, value));
            }
        }
        setCards(cards);
        shuffle();
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

    public Card dealCard() {
        return cards.remove(cards.size() - 1);
    }
}
