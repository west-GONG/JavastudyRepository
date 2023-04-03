package title1;

import java.util.ArrayList;
import java.util.List;

public class DouDiZhuPoker extends Poker{
    public void generate() {
        List<String> card=new ArrayList<>();
        String[] suits = {"♥", "♠", "♦", "♣"};
        String[] ranks = {"3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A", "2"};
        for (String suit : suits) {
            for (String rank : ranks) {
                card=getCards();
                card.add(rank + suit);
            }
        }
        card.add("小王");
        card.add("大王");
    }
}
