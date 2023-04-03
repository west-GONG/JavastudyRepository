package title2;

import java.util.*;

public class studentCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 创建Map，用于统计每个系别学生的人数
        Map<String, List<String>> departmentMap = new HashMap<>();

        while (true) {
            System.out.print("请输入学生的姓名和所在系别（以空格分隔，输入exit结束）：");
            String input = scanner.nextLine();

            if (input.equals("exit")) {
                break;
            }

            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                System.out.println("输入格式错误，请重新输入！");
                continue;
            }

            String name = parts[0];
            String department = parts[1];

            if (!departmentMap.containsKey(department)) {
                departmentMap.put(department, new ArrayList<>());
            }
            List<String> students = departmentMap.get(department);
            students.add(name);
        }

        // 输出结果
        for (Map.Entry<String, List<String>> entry : departmentMap.entrySet()) {
            String department = entry.getKey();
            List<String> students = entry.getValue();
            int count = students.size();
            System.out.printf("%s: %d人，%s%n", department, count, String.join(", ", students));
        }
    }
}
