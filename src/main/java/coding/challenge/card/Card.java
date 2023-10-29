package coding.challenge.card;

public abstract class Card {
    private final StandardSuit suit;
    private final int value;
    private boolean available = Boolean.TRUE;

    public Card(StandardSuit suit, int value) {
        this.suit = suit;
        this.value = value;
    }
}
