package OOPSPackage;

public class ParentOverringConcept {
    //overridden method
    public void m1(){
        System.out.println("I am m1() of parent");
    }
}
class ChildOverringConcept extends  ParentOverringConcept{
    //overriding method
     public void m1(){
         System.out.println("I am m1() of child");
     }
}
