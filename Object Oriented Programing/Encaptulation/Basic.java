// Code-Based Questions

// These are important for exams + hackathons.

// 1. Create a Class with Encapsulation
// Create a class Basic
// Private variables: name, surname , mobile_no
// Provide getters and setters for these variables.

// 👉 Encapsulation expects:
// One setter per variable
// One getter per variable

import java.util.Scanner;

class Basic {
    private String name;
    private String surname;
    private long mobile_no;

    //setters
    void setname(String name){
        this.name = name;
    }

    void setsurname(String surname){
        this.surname = surname;
    }

    void setmobile_no(long mobile_no){
        this.mobile_no = mobile_no;
    }

    //Getters
    String getname(){
        return name;
    }

    String getsurname(){
        return surname;
    }

    long getmobile_no(){
        return mobile_no;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Basic b = new Basic();

        System.out.print("Enter the name: ");
        b.setname(sc.nextLine());
        System.out.print("Enter the surname: ");
        b.setsurname(sc.nextLine());
        System.out.print("Enter the mobile number: ");
        b.setmobile_no(sc.nextLong());

        System.out.println("The name is: " + b.getname());
        System.out.println("The surname is: " + b.getsurname());
        System.out.println("The mobile number is: " + b.getmobile_no());

    }
}