package Oops.Polymorphism;


 class Khushboo{
     void identity(){
        System.out.println("identity of khushboo");
    };
}


class College extends Khushboo{
     void identity(){
         System.out.println("Khushboo's ID in college is her rollnumber");
     }
     void name(String name){
         System.out.println("college name: "+ name);
     }
}

class Office extends Khushboo{
     void identity(){
         System.out.println("Khushboo's id in office is punchCard ");
     }
     void name(String name){
         System.out.println("office name: "+name);
     }
}
public class Overriding {
    public static void main(String[] args) {
        //parent class
//        Khushboo ov = new Khushboo();
//        ov.identity(" at home is TUNNA");

        Office o1 = new Office();
        o1.identity();
        o1.name("Hotwax Systems");

        College c = new College();
        c.identity();
        c.name("CDGI");
    }

}
