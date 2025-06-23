public class MVCPatternTest {
    public static void main(String[] args) {
        // Create model and view
        Student student = new Student();
        student.setName("John Doe");
        student.setId("S101");
        student.setGrade("A");

        StudentView view = new StudentView();

        // Create controller and connect model + view
        StudentController controller = new StudentController(student, view);

        // Display initial details
        controller.updateView();

        // Update details using controller
        controller.setStudentName("Jane Smith");
        controller.setStudentGrade("A+");

        // Display updated details
        controller.updateView();
    }
}
