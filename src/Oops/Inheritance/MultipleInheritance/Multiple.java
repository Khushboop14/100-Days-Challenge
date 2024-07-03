package Oops.Inheritance.MultipleInheritance;

class Vehicle{
    int millege;
    String color;
    String engine;
    int wheels;

    void engine(){
        System.out.println("Vehicle have engine");
    }
}
 class Car extends Vehicle{
    void wheels(){
        System.out.println("Car have 4 wheels");
    }
}
 class Sports extends Car {
    void seat(){
        System.out.println("Sports car have 2 seats only");
    }

}

public class  Multiple{
    public static void main(String[] args) {
        // object of grand-parent class Vehicle
        System.out.println("Vehicle class object : ");
        Vehicle v = new Vehicle();
        v.engine();

        System.out.println("Car class object : ");

        //object of parent class Car
        Car c = new Car();
        c.wheels();
        c.engine();
        System.out.println("Sports class object : ");

        //object of child class Sports Car
        Sports s = new Sports();
        s.engine();
        s.wheels();
        s.seat();

    }
}
