import java.util.ArrayList;

public class School {
    private String name;
    private ArrayList<Department> departments;

    public School(String name) {
        this.name = name;
        departments = new ArrayList<Department>();
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void getDepartments() {
        System.out.println("Departments: ");
        for (Department department: departments) {
            department.printName();
        }
        System.out.println("");
    }

    public void printName() {
        System.out.println("School: " + name);
    }
}
