public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student("Sandeep", 82);
        Student s2 = new Student("Sanjana");
        Student s3 = new Student(21);
        Student s4 = new Student(s2);
    }
}

class Student {
    String name;
    int rollNo;

    Student(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
    }

    Student(String name) {
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

    // Copy constructor
    Student(Student s1) {
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }
}
