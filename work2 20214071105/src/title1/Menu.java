package title1;

import java.util.Scanner;

public class Menu {
    private static Scanner scanner = new Scanner(System.in);
    private static StudentManage studentManage = new StudentManage();

    public static void main(String[] args) {
        while (true) {
            System.out.println("=== Student Information Management System ===");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Query Student");
            System.out.println("5. Display All Students");
            System.out.println("0. Quit");
            System.out.println("Please select an option:");
            int option = scanner.nextInt();
            scanner.nextLine(); // 读取换行符

            switch (option) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    removeStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    queryStudent();
                    break;
                case 5:
                    displayAllStudents();
                    break;
                case 0:
                    System.out.println("Thanks for using!");
                    return;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
        }
    }

    private static void addStudent() {
        System.out.println("Input ID：");
        String id = scanner.nextLine();
        System.out.println("Input Name：");
        String name = scanner.nextLine();
        System.out.println("Input Gender：");
        String gender = scanner.nextLine();
        System.out.println("Input Major：");
        String major = scanner.nextLine();
        System.out.println("Input Grade：");
        int grade = scanner.nextInt();
        scanner.nextLine();
        Student student = new Student(id, name, gender, major, grade);
        boolean result = studentManage.addStudent(student);
        if (result) {
            System.out.println("Add student successfully.");
        } else {
            System.out.println("Failed to add student.");
        }
    }

    private static void removeStudent() {
        System.out.println("Input ID of the student you want to remove:");
        String id = scanner.nextLine();
        boolean result = studentManage.removeStudent(id);
        if (result) {
            System.out.println("Remove student successfully.");
        } else {
            System.out.println("Failed to remove student.");
        }
    }

    private static void updateStudent() {
        System.out.println("Input ID of the student you want to update:");
        String id = scanner.nextLine();
        Student oldStudent = studentManage.queryStudent(id);
        if (oldStudent == null) {
            System.out.println("The student does not exist.");
            return;
        }
        System.out.println("Please input the updated information：");
        System.out.println("Name（" + oldStudent.getName() + "）：");
        String name = scanner.nextLine();
        System.out.println("Gender（" + oldStudent.getGender() + "）：");
        String gender = scanner.nextLine();
        System.out.println("Major（" + oldStudent.getMajor() + "）：");
        String major = scanner.nextLine();
        System.out.println("Grade（" + oldStudent.getGrade() + "）：");
        int grade = scanner.nextInt();
        scanner.nextLine();

        Student newStudent = new Student(id, name, gender, major, grade);
        boolean result = studentManage.updateStudent(newStudent);
        if (result) {
            System.out.println("Update student successfully.");
        } else {
            System.out.println("Failed to update student.");
        }
    }

    private static void queryStudent() {
        System.out.println("Input ID of the student you want to query:");
        String id = scanner.nextLine();
        Student student = studentManage.queryStudent(id);
        if (student == null) {
            System.out.println("The student does not exist.");
        } else {
            System.out.println("ID：" + student.getId());
            System.out.println("Name：" + student.getName());
            System.out.println("Gender：" + student.getGender());
            System.out.println("Major：" + student.getMajor());
            System.out.println("Grade：" + student.getGrade());
        }
    }

    private static void displayAllStudents() {
        studentManage.displayAllStudents();
    }
}
