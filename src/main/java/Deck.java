import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private final List<Card> deckTemplate = Arrays.asList(
            new Card("hearts", "2"),
            new Card("hearts", "3"),
            new Card("hearts", "4"),
            new Card("hearts", "5"),
            new Card("hearts", "6"),
            new Card("hearts", "7"),
            new Card("hearts", "8"),
            new Card("hearts", "9"),
            new Card("hearts", "10"),
            new Card("hearts", "J"),
            new Card("hearts", "Q"),
            new Card("hearts", "K"),
            new Card("hearts", "A"),

            new Card("diamonds", "2"),
            new Card("diamonds", "3"),
            new Card("diamonds", "4"),
            new Card("diamonds", "5"),
            new Card("diamonds", "6"),
            new Card("diamonds", "7"),
            new Card("diamonds", "8"),
            new Card("diamonds", "9"),
            new Card("diamonds", "10"),
            new Card("diamonds", "J"),
            new Card("diamonds", "Q"),
            new Card("diamonds", "K"),
            new Card("diamonds", "A"),

            new Card("clubs", "2"),
            new Card("clubs", "3"),
            new Card("clubs", "4"),
            new Card("clubs", "5"),
            new Card("clubs", "6"),
            new Card("clubs", "7"),
            new Card("clubs", "8"),
            new Card("clubs", "9"),
            new Card("clubs", "10"),
            new Card("clubs", "J"),
            new Card("clubs", "Q"),
            new Card("clubs", "K"),
            new Card("clubs", "A"),

            new Card("spades", "2"),
            new Card("spades", "3"),
            new Card("spades", "4"),
            new Card("spades", "5"),
            new Card("spades", "6"),
            new Card("spades", "7"),
            new Card("spades", "8"),
            new Card("spades", "9"),
            new Card("spades", "10"),
            new Card("spades", "J"),
            new Card("spades", "Q"),
            new Card("spades", "K"),
            new Card("spades", "A")
    );

    private ArrayList<Card> deck = new ArrayList<>(deckTemplate);

    public List<Card> getDeck() {
        return deck;
    }

    private Card getRandomCard() {
        return deck.get((int) (Math.random() * deck.size()));
    }

    private void removeCard(Card cardToRemove) {
        deck.remove(cardToRemove);
    }

    public Card dealCard() {
        Card card = getRandomCard();
        removeCard(card);
        return card;
    }

    public void resetDeck() {
        deck = new ArrayList<>(deckTemplate);
    }
}
