public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDatabase();
        StudentView view = new StudentView();   
        StudentController controller = new StudentController(model, view);

        controller.updateView();
        controller.setStudentName("Biba");
        controller.updateView();
    }

    private static Student retriveStudentFromDatabase() {
        Student s = new Student();
        s.setRollNo("696969");
        s.setName("Boba");

        return s;
    }
}
