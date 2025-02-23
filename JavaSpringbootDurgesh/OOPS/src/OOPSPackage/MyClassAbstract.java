package OOPSPackage;

abstract public class MyClassAbstract {

    //complete method
    public void cal(){
        System.out.println("Calculating result");
    }

    //abstract method
    abstract public void launchRocket();
}
//abstract class can not be instantiated means we cannot make object of abstract class

class MyChildAbstract extends MyClassAbstract{
    public void launchRocket(){
        System.out.println("My child class Launching rocket");
    }
}
class Start{
    public static void main(String[] args){
//        MyChildAbstract childCl = new MyChildAbstract();
//        childCl.launchRocket();
//        childCl.cal();

//        MyClassAbstract obj = new MyChildAbstract();
//        obj.cal();
//        obj.launchRocket();

    }
}