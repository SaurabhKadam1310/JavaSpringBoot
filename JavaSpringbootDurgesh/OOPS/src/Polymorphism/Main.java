package Polymorphism;

public class Main {
    public static void main(String[] args) {
        System.out.println("This is just for testing: ");
        Student stud = new Student();
        stud.read();
        stud.read("Atomic Habits");
        Person p = new Shyam();
        p.showDetail();
        Ram r = new Ram();
        r.doWork(p);
    }
}
