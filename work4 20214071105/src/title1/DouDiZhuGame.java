package title1;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class DouDiZhuGame {
    public static void main(String[] args) {
        Poker poker = new DouDiZhuPoker();
        poker.generate();
        poker.shuffle();
        List<List<String>> hands = poker.deal(3, 17);
        System.out.println("发牌后的手牌：");
        for (int i = 0; i < 3; i++) {
            System.out.printf("玩家%d：%s\n", i + 1, hands.get(i));
        }
    }
}
