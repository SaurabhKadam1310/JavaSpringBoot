package OOPSPackage;

public class Student {
    public Student(){
        this(1,"Sau","karad");
        System.out.println("Creating object: non-parameterized constructor");
    }
    // constructor overloading
    public  Student(int i,String n, String c){
        studentId = i;
        studentName = n;
        studentCity = c;
        System.out.println("Parameterized constructor: having 1 parameter");
    }
    int studentId;
    String studentName;
    String studentCity;

    public void study(){
        System.out.println(studentName+" is studying");
    }

    public  void showFullDetails(){
        System.out.println("My name is "+studentName);
        System.out.println("My id is "+studentId);
        System.out.println("My city is "+studentCity);
    }
}
