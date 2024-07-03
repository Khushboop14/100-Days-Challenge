package Oops.Abstraction;

abstract class Car{
    abstract public void fuelType();
    public void color(){
        System.out.println("normal method of abstract class");
    }

}
class Tata extends Car{

    @Override
    public void fuelType() {
        System.out.println("implementation fueltype method of abstact class in TATA class.");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        Tata t = new Tata();
        t.fuelType();
        t.color();
    }
}
