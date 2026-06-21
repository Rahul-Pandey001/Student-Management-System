public class StudentRole extends Person {

    public StudentRole(String name) {
        super(name);
    }

    @Override
    public void displayRole() {
        System.out.println(name + " is a Student.");
    }
}
