// 1. Abstract Class Example
// Create an abstract class Animal
// Abstract method: makeSound()
// Create subclass Dog and implement it

import java.util.*;

abstract class Animal {
    abstract void bark();
}

class Dog extends Animal {
    void bark(){
        System.out.println("The dog does bark!");
    }
}

class Basic extends Dog {
    public static void main(String[] args){
        Dog d = new Dog();
        d.bark();
    }
}