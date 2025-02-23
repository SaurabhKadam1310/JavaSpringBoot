package OOPSPackage;

import javafx.scene.shape.Circle;

public interface ShapeInterface {
public static final int i = 2;
public abstract void calculateArea(int r);
}
class Cirle implements ShapeInterface{
    public void calculateArea(int r){
        System.out.println("Area of circle is :"+(Math.PI*r*r));
    }
    public static void main(String[] args){
        ShapeInterface c = new Cirle();
        c.calculateArea(c.i);

    }
}
