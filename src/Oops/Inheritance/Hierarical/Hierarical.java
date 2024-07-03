package Oops.Inheritance.Hierarical;

import java.sql.SQLOutput;

class SpringFramework{
         public void dependencyInj(){
             System.out.println("I am dependency Injection feature of SpringFramework");
         }
}

class SpringBoot extends SpringFramework{

        public void aop(){
        System.out.println("I am aop of SpringBoot");
        System.out.println("I am module of SpringFramework");
    }

}
class SpringMVC extends SpringBoot  {
    public void orm(){
        System.out.println("extended springBoot");
        System.out.println("I am ORM feature of SPringMVC");
//        System.out.println("I am module of SpringFramework");
    }

    public static void main(String[] args) {
        System.out.println("SPRING MVC OBJECT");
        SpringMVC smvc = new SpringMVC();
        smvc.dependencyInj();
        smvc.orm();
        System.out.println("SPRING BOOT OBJECT");
        SpringBoot sb = new SpringBoot();
        sb.aop();
        sb.dependencyInj();
    }

}

