public class Class {
    public static void main(String args[]) {
        Class student = new Class();
        student.setName("Tsi");
        System.out.println("Student name: " + student.getName());
        student.study();
        student.takeExam();
    }

    // Data fields (state)
    private String name;

    // Behavior methods
    public void study() { // Method 1
        System.out.println("Studying...");
    }

    public void takeExam() { // Method 2
        System.out.println("Taking exam...");
    }

    public String getName() { // Accessor method
        return name;
    }

    public void setName(String n) { // Mutator method
        name = n;
    }

}
