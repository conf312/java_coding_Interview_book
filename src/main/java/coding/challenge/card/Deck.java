package coding.challenge.card;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Deck<T extends Card> implements Iterable<T> {
    private final List<T> cards;

    public Deck(Pack pack) {
        this.cards = pack.getCards();
    }
    
    public void shuffle() {
        Collections.shuffle(cards);
    }
    
    public List<T> dealHand(int numberOfCards) {
        // 손을 다루는 코드 구현
        return null;
    }
    
    public T dealCard() {
        // 카드 1장을  다루는 코드 구현
        return null;
    }
    
    public int remainingCards() {
        return cards.size();
    }
    
    public void removeCards(List<T> cards) {
        // 카드를 제거하는 코드 구현
    }

    @Override
    public Iterator<T> iterator() {
        // Card 반복자 구현
        return null;
    }
}
