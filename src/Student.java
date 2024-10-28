public class Student {
    private String name;
    private String gradelevel;

    public Student(String name, String gradelevel) {
        this.name = name;
        this.gradelevel = gradelevel;
    }
    
    public void getName() {
        System.out.print(name);
    }

    public void getGrade() {
        System.out.print(gradelevel);
    }

    // Edge Case #3: Reset name of student
    public void setName(String name) {
        this.name = name;
    }
}
