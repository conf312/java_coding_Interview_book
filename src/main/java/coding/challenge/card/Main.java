package coding.challenge.card;

public class Main {
    public static void main(String[] args) {
        // 표준 트럼프 카드 한 장을 생성합니다.
        Card sevenHeart = new StandardCard(StandardSuit.HEARTS, 7);

        // 표준 카드 한 벌을 생성합니다.
        Pack cp = new StandardPack();
        Deck deck = new Deck(cp);

        System.out.println("Remaining card : " + deck.remainingCards());
    }
}
