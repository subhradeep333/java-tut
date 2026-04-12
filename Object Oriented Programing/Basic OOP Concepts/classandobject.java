// Create a class and object to print student details
import java.util.*;

class student {
    String name;
    int roll;

    void display(){
        System.out.println("The name of the student is: " + name);
        System.out.println("The roll no. of the student is: " + roll);
    }
}

class classandobject {
    public static void main(String[] args) {
        student s1 = new student();
        s1.name = "Subhradeep";
        s1.roll = 17;

        s1.display();
    }
}