//the time complexity is O(1)
class Student {
    private int id;
    private String name;
    private double gpa;

    // Constructor with GPA validation
    public Student(int id, String name, double gpa) {
        this.id = id;
        this.name = name;
        setGpa(gpa);
    }

    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            System.out.println("Error: GPA must be between 0.0 and 4.0");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Alice", 3.5);
        System.out.println("Student 1 GPA: " + student1.getGpa());

        student1.setGpa(4.5); // Should print an error message
        System.out.println("After invalid update, Student 1 GPA: " + student1.getGpa());

        Student student2 = new Student(102, "Bob", -1.0); // Should print an error
        System.out.println("Student 2 GPA: " + student2.getGpa());
    }
}
