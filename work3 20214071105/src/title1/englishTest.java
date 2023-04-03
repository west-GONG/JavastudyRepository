package title1;

import java.util.HashMap;
import java.util.Map;

public class englishTest {
    public static void main(String[] args) {
        String paragraph = "This is a sample paragraph to demonstrate word count in " +
                "Java. Java is a popular programming language.";

        // 将段落按照空格进行分割，得到单词数组
        String[] words = paragraph.split("\\s+");

        // 创建Map，用于统计每个单词出现的次数
        Map<String, Integer> wordCount = new HashMap<>();

        // 遍历单词数组，统计每个单词出现的次数
        for (String word : words) {
            if (!wordCount.containsKey(word)) {
                wordCount.put(word, 1);
            } else {
                int count = wordCount.get(word);
                wordCount.put(word, count + 1);
            }
        }

        // 输出结果
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
