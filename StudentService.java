import java.util.ArrayList;

public class StudentService {

    private ArrayList<Student> students = new ArrayList<>();

    public void addStudent(Student student) {
        students.add(student);
        System.out.println("Student Added Successfully!");
    }

    public void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void searchStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {
                System.out.println(student);
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    public void updateStudent(int id, String newName,
                              int newAge, String newCourse) {

        for (Student student : students) {

            if (student.getId() == id) {

                student.setName(newName);
                student.setAge(newAge);
                student.setCourse(newCourse);

                System.out.println("Student Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    public void deleteStudent(int id) {

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);
                System.out.println("Student Deleted Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }
}
