//package OOPs;
/*
Write a Java program that creates a class hierarchy for employees of a company. The base class should be Employee, with subclasses Manager, Developer, and Programmer. Each subclass should have properties such as name, address, salary, and job title. Implement methods for calculating bonuses, generating performance reports, and managing projects.
Bonus depends on salary
Manager → 20% of salary
Developer → 10% of salary
Programmer → 8% of salary
Performance depends on bonus
Bonus ≥ 8000 → Excellent
Bonus ≥ 4000 → Good
Bonus < 4000 → Average
*/
import java.util.*;
class Employee{
    String name, address, jobTitle; 
    int salary;
    Employee(String name, String address, int salary, String jobTitle){
        this.name = name;
        this.address = address;
        this.salary = salary;
        this.jobTitle = jobTitle;
    }
    double bonusCalc(){
        return 0.5*salary;
    }
    void performance(){
        double bonus = bonusCalc();
        if (bonus >= 8000)
            System.out.println("Performance Report: Excellent" );
        else if (bonus >= 4000)
            System.out.println("Performance Report: Good");
        else
            System.out.println("Performance Report: Average");
    }
    void reports(){
        System.out.println("Managed by : " +name);
    }
}
class Programmer extends Employee{
    Programmer(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    double bonusCalc(){
        return 0.20*salary;
    }
}
class Manager extends Employee{
    Manager(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    double bonusCalc(){
        return 0.10*salary;
    }
}
class Developer extends Employee{
    Developer(String name, String address, int salary, String jobTitle){
        super(name, address, salary, jobTitle);
    }
    double bonusCalc(){
        return 0.8*salary;
    }
}
public class Company {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("--Programmer--");
        System.out.println("Enter salary: ");
        int s1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String n1 = sc.nextLine();
        System.out.println("Enter address: ");
        String a1 = sc.nextLine();
        System.out.println("Enter job title: ");
        String jt1 = sc.nextLine();
        Programmer obj1 = new Programmer(n1, a1, s1, jt1);
        System.out.println("Bonus= " + obj1.bonusCalc());
        obj1.performance();
        obj1.reports();

        System.out.println("--Manager--");
        System.out.println("Enter salary: ");
        int s2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String n2 = sc.nextLine();
        System.out.println("Enter address: ");
        String a2 = sc.nextLine();
        System.out.println("Enter job title: ");
        String jt2 = sc.nextLine();
        Manager obj2 = new Manager(n2, a2, s2, jt2);
        System.out.println("Bonus= " + obj2.bonusCalc());
        obj2.performance();
        obj2.reports();

        System.out.println("--Developer--");
        System.out.println("Enter salary: ");
        int s3 = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter name: ");
        String n3 = sc.nextLine();
        System.out.println("Enter address: ");
        String a3 = sc.nextLine();
        System.out.println("Enter job title: ");
        String jt3 = sc.nextLine();
        Programmer obj3 = new Programmer(n3, a3, s3, jt3);
        System.out.println("Bonus= " + obj3.bonusCalc());
        obj3.performance();
        obj3.reports();
    }
}
