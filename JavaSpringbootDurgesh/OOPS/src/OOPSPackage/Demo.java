package OOPSPackage;

public class Demo {
    public static void main(String[] args){

        //now creating object of student
        Student st1 ;
        // like int i
        st1 = new Student();
        st1.studentName = "Ram";
        st1.studentId = 101;
        st1.studentCity = "Pune";

        st1.study();
        st1.showFullDetails();

        Student st2 = new Student(741,"Shyam","Mumbai"); //creating object
//        st2.studentName = "Shyam";
//        st2.studentId = 741;
//        st2.studentCity = "Mumbai";
        st2.showFullDetails();
        st2.study();

        Dog d = new Dog();
        System.out.println(d.color);
        d.eating();
        d.speak();
    }
}
