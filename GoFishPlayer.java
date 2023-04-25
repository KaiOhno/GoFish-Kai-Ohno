package ca.sheridancollege.project;

import java.util.ArrayList;

public class GoFishPlayer extends Player {
    private ArrayList<Card> hand;

    public GoFishPlayer(String name) {
        super(name);
        hand = new ArrayList<>();
    }

    public void addToHand(Card card) {
        hand.add(card);
    }

    @Override
    public void play() {
        // Implement game logic here
    }
}
