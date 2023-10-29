package coding.challenge.card;

import java.util.ArrayList;
import java.util.List;

public class StandardPack extends Pack {
    public StandardPack() {
        super.setCards(build());
    }

    @Override
    protected List build() {
        List<StandardCard> cards = new ArrayList<>();
        return cards;
    }
}
