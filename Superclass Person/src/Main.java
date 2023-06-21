public class Main {
    public static void main(String[] args) {

        Person person = new Person("John", "123 Main St");
        System.out.println(person.toString());

        Student student = new Student("Jane", "456Park Ave", "Computer Science", 3, 5000.0);
        System.out.println(student.toString());

        Staff staff = new Staff("Bob", "789 Broadway", "School of Engineering", 75000.0);
        System.out.println(staff.toString());

    }
}