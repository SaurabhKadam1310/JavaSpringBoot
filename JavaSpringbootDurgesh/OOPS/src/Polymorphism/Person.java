package Polymorphism;

public class Person {
    public void showDetail(){
        System.out.println("Basics details of Person");
    }
}

 class Emp extends Person{
   public void showDetail(){
       System.out.println("Showing details of employee");
   }
}