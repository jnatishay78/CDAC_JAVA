public class Student {
    String name;

    public Student() {
        this.name = "Unknown";
    }

    public Student(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public static void main(String[] args) {
        Student student1 = new Student();
        System.out.println("Student 1 Name: " + student1.getName());

        Student student2 = new Student("Atishay");
        System.out.println("Student 2 Name: " + student2.getName());

        Student student3 = new Student("Laveena");
        System.out.println("Student 3 Name: " + student3.getName());
    }
}
