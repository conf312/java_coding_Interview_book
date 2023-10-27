package coding.challenge.vending;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Vending implements Selector {
    private final Inventory<Coin> coinInventory = new Inventory<>();
    private final Inventory<Item> itemInventory = new Inventory<>();
    private int totalSize;
    private int currentBalance;
    private Item currentItem;

    public Vending() {
        initMachine();
    }

    private void initMachine() {
        System.out.println("Initializing vending machine");
    }

    @Override
    public int checkPriceBtn(Item item) {
        return item.getPrice();
    }

    @Override
    public void insertCoinBtn(Coin coin) {
    }

    @Override
    public Map<Item, List<Coin>> buyBtn() {
        return Collections.singletonMap(currentItem, collectChange());
    }

    @Override
    public List<Coin> refundBtn() {
        return null;
    }

    @Override
    public void resetBtn() {

    }

    private List<Coin> collectChange() {
        return null;
    }

}
