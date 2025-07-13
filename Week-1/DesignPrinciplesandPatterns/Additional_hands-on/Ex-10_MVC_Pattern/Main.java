class Student {
    String name;
    int id;
    String grade;
    Student(String name, int id, String grade) {
        this.name = name;
        this.id = id;
        this.grade = grade;
    }
}
class StudentView {
    void display(Student s) {
        System.out.println(s.name + ", " + s.id + ", " + s.grade);
    }
}
class StudentController {
    Student student;
    StudentView view;
    StudentController(Student s, StudentView v) {
        student = s;
        view = v;
    }
    void display() {
        view.display(student);
    }
}
public class Main {
    public static void main(String[] args) {
        Student s = new Student("Ankitha", 101, "A");
        StudentController c = new StudentController(s, new StudentView());
        c.display();
    }
}