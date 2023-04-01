package title1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentManage {
    private List<Student> studentList=new ArrayList<Student>();

    public StudentManage() {
        studentList = new ArrayList<>();
    }

    // 添加学生
    public boolean addStudent(Student student) {
        return studentList.add(student);
    }

    // 删除学生
    public boolean removeStudent(String id) {
        Iterator<Student> iterator = studentList.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getId().equals(id)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    // 修改学生
    public boolean updateStudent(Student student) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(student.getId())) {
                studentList.set(i, student);
                return true;
            }
        }
        return false;
    }

    // 查询学生
    public Student queryStudent(String id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().equals(id)) {
                return studentList.get(i);
            }
        }
        return null;
    }

    // 显示所有学生信息
    public void displayAllStudents() {
        for (Student student : studentList) {
            System.out.println("ID：" + student.getId());
            System.out.println("Name：" + student.getName());
            System.out.println("Gender：" + student.getGender());
            System.out.println("Major：" + student.getMajor());
            System.out.println("Grade：" + student.getGrade());
            System.out.println("=========================");
        }
    }
}
