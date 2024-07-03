package Oops.Polymorphism;

public class Overloading {

        void tunna(){
            System.out.println("tunna at home");
        }
        void tunna(String name, int rollnumber){
            System.out.println("tunna at college identify as "+ name +" and her rollnumber is "+ rollnumber );
        }
        int tunna(int id){
            System.out.println("tunna at office requires:  "+ id);
            return 1;
        }
        // operator overloading
    void operator(){

    }

    public static void main(String[] args) {
        Overloading ov = new Overloading();
        ov.tunna();
        ov.tunna(234);
        ov.tunna( "khushboo", 67);
    }
 }
