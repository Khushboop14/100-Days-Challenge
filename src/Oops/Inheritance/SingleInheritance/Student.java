package Oops.Inheritance.SingleInheritance;

class Person{

        String name;
        int age;
        private final int govId;

        public Person(){
            this.name = "tunna";
            this.age = 20;
            this.govId = 12234567;
        }
        public void displayInfo(){
            System.out.println(name);
            System.out.println(age);
            System.out.println(govId);

        }
    }
 public class Student extends Person{
    String colgName;
    public Student(){
        super();
        this.colgName = "chikni chameli chupke akeli";
    }
    public void studentDetail(){
        System.out.println(colgName);
    }

    public static void main(String[] args) {
        Student p = new Student();
        p.displayInfo();
        p.studentDetail();

    }

}
