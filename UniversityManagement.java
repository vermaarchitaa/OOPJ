// Student class
class Student {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Student(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
    }
}

// Course class
class Course {
    private String courseId;
    private String courseName;
    private int credits;

    // Constructor
    public Course(String courseId, String courseName, int credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
    }

    // Getter methods
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }

    // Display method
    public void displayDetails() {
        System.out.println("Course ID: " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Credits: " + credits);
    }
}

// Main class
public class UniversityManagement {
    public static void main(String[] args) {
        // Create Student object
        Student s1 = new Student(101, "Archita", "CSE (AI & ML)");

        // Create Course object
        Course c1 = new Course("CSE101", "Data Structures", 4);

        // Display details
        System.out.println("---- Student Details ----");
        s1.displayDetails();

        System.out.println("\n---- Course Details ----");
        c1.displayDetails();
    }
}

