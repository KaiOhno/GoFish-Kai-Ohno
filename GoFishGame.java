package ca.sheridancollege.project;

import java.util.ArrayList;

public class GoFishGame extends Game {
    private GoFishDeck deck;

    public GoFishGame(String name) {
        super(name);
        deck = new GoFishDeck();
    }

    @Override
    public void play() {
        // Implement game logic here
    }

    @Override
    public void declareWinner() {
        // Implement logic to declare a winner
    }

    public static void main(String[] args) {
        GoFishGame game = new GoFishGame("Go Fish");
        // Add players, deal cards, and play the game
    }
}
