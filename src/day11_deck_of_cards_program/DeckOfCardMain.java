package day11_deck_of_cards_program;

public class DeckOfCardMain {
    public static void main(String[] args) {
        DeckOfCards deckOfCards = new DeckOfCards();
        deckOfCards.shuffle();
        System.out.print(deckOfCards.printDeck() + "     ");

    }
}
