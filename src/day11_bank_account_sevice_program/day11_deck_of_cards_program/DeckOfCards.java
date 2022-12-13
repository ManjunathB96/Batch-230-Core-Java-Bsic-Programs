package day11_bank_account_sevice_program.day11_deck_of_cards_program;

public class DeckOfCards {
    static String rank[] = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    static String suits[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
    static int n = suits.length * rank.length;
    static String[] deck = new String[n];

    private static int currentCard;

    public DeckOfCards() {
        currentCard = 0;
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " of " + suits[j];
            }
        }
    }

    public void shuffle() {
        currentCard = 0;
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int) (Math.random() * (deck.length - i));
            String temp = deck[i];
            deck[i] = deck[r];
            deck[r] = temp;
        }
    }

    public boolean printDeck() {
        for (int i = 0; i < 4; i++) {                                    // print shuffled deck
            System.out.println("** Person " + (i + 1) + " **");
            for (int j = 0; j < 5; j++) {
                System.out.println(deck[i + j * 4] + " (Card " + (i + j * 4) + ")");
            }
        }
        return true;
    }
}
