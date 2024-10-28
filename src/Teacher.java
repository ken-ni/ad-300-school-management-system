public class Teacher {
    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public void getName() {
        System.out.print(name);
    }

    public void getSubject() {
        System.out.print(subject);
    }

    public void setName(String name) {
        this.name = name;
    }
}
