public class Main {
    public static void main(String[] args) throws Exception {
        School mySchool = new School("Washington Middle School");

        // Create math department with teachers and students
        Department math = new Department("Mathematics");
        Teacher mathteacher1 = new Teacher("John George", "Geometry");
        Teacher mathteacher2 = new Teacher("Math Man", "Algebra");
        Student mathstudent1 = new Student("Lauren Smith", "Grade 7");
        Student mathstudent2 = new Student("Bobby Brown", "Grade 8");
        Student mathstudent3 = new Student("Abe Laughlin", "Grade 7");


        // Create science department with teachers and students
        Department science = new Department("Science");
        Teacher scienceteacher1 = new Teacher("Olsen Hod", "Biology");
        Teacher scienceteacher2 = new Teacher("Peter Pan", "Environmental Sciences");
        Student sciencestudent1 = new Student("Miller White", "Grade 6");
        Student sciencestudent2 = new Student("Henry Pham", "Grade 6");
        Student sciencestudent3 = new Student("Jason Huang", "Grade 7");

        // Add teachers and math to math department
        mySchool.addDepartment(math);
        math.addTeacher(mathteacher1);
        math.addTeacher(mathteacher2);
        math.addStudent(mathstudent1);
        math.addStudent(mathstudent2);
        math.addStudent(mathstudent3);

        // Add teachers and math to science department
        mySchool.addDepartment(science);
        science.addTeacher(scienceteacher1);
        science.addTeacher(scienceteacher2);
        science.addStudent(sciencestudent1);
        science.addStudent(sciencestudent2);
        science.addStudent(sciencestudent3);

        // Show school name and departments
        mySchool.printName();
        mySchool.getDepartments();
        // Show each department with their teachers and students
        math.getAll();
        science.getAll();

        // Edge cases
        System.out.println("");
        System.out.println("");
        System.out.println("Edge Cases");

        // Test 1: Check if teachers or students is empty
        // Solution: Check if students/teacher is empty. If it is, change output accordingly
        Department emptydepartment = new Department("Test 1");
        emptydepartment.getAll();

        // Test 2: Add duplicate entry into teachers or students list
        // Solution: Check if students/teacher has entry already. If it does, inform user
        Department duplicatetest = new Department("Test 2");
        Student teststudent1 = new Student("test student", "test grade");
        duplicatetest.addStudent(teststudent1);
        duplicatetest.addStudent(teststudent1);
        duplicatetest.getAll();

        // Test 3: Incorrectly named student/teacher
        // Solution: Create setter for names in case this happens
        Department namechange = new Department("Test 3");
        Student teststudent2 = new Student("Gerge Wset", "Grade 8");
        namechange.addStudent(teststudent2);
        namechange.getStudents();
        teststudent2.setName("George West");
        namechange.getStudents();
    }
}
