package title1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Poker {
    private List<String> cards = new ArrayList<>();


    public List<String> getCards() {
        return cards;
    }

    // 生成扑克牌
    public void generate() {
        String[] suits = {"♥", "♠", "♦", "♣"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        for (String suit : suits) {
            for (String rank : ranks) {
                cards.add(rank + suit);
            }
        }
        cards.add("小王");
        cards.add("大王");
    }

    // 洗牌
    public void shuffle() {
        Collections.shuffle(cards);
    }

    // 发牌
    public List<List<String>> deal(int nPlayers, int nCards) {
        List<List<String>> hands = new ArrayList<>();
        for (int i = 0; i < nPlayers; i++) {
            hands.add(new ArrayList<>());
        }
        for (int j = 0; j < nCards; j++) {
            for (int i = 0; i < nPlayers; i++) {
                List<String> hand = hands.get(i);
                hand.add(cards.remove(0));
            }
        }
        return hands;
    }

    // 显示扑克牌
    public void display() {
        System.out.println(cards);
    }
}
