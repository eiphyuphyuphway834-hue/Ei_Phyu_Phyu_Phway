public class Main {
    public static void main(String[] args) {

        Person p = new Person("Generic", "P001");
        Person p1 = new Student("Ali", "S001");
        Person p2 = new Lecturer("Dr. Tan", "L001");

        p.introduce();
        p1.introduce();
        p2.introduce();
    }
}