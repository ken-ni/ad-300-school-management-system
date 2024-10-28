import java.util.ArrayList;

public class Department {
    private String name;
    private ArrayList<Teacher> teachers;
    private ArrayList<Student> students;
    
    public Department(String name) {
        this.name = name;
        teachers = new ArrayList<Teacher>();
        students = new ArrayList<Student>();
    }

    public void addTeacher(Teacher teacher) {
        // Edge case #2: What if teacher or student is already registered?
        if (!teachers.contains(teacher)) {
            teachers.add(teacher);
        } else {
            System.out.println("This teacher is already registered!");
        }
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
        } else {
            System.out.println("This student is already registered!");
        }
    }

    public void getTeachers() {
        // Edge case #1: What if teachers or students is empty?
        if (!teachers.isEmpty()) {
            System.out.println("Teachers: ");
            for (Teacher teacher: teachers) {
                teacher.getName();
                System.out.print(", ");
                teacher.getSubject();
                System.out.println("");
            }
        } else {
            System.out.println("There are no teachers in this department!");
        }
    }

    public void getStudents() {
        if (!students.isEmpty()) {
            System.out.println("Students: ");
            for (Student student: students) {
                student.getName();
                System.out.print(", ");
                student.getGrade();
                System.out.println("");
            }
        } else {
            System.out.println("There are no students in this department!");
        }
    }

    public void getAll() {
        System.out.println(name + " Department");
        getTeachers();
        getStudents();
        System.out.println("");
    }

    public void printName() {
        System.out.println(name);
    }
}
