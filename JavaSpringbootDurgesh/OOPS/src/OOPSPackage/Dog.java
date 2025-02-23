package OOPSPackage;

public class Dog extends Animal{
 int x = 4;
 public Dog(){
     super();
     System.out.println("child constructor/Dog constructor work");
     System.out.println("child constructor/Dog constructor work");
 }
 public void speak(){
     System.out.println(this.x); //for current object/reference
     System.out.println(super.x); //for immediate parent
 }
}
