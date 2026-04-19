// 2. Validation Using Setter
// Create a class BankAccount
// Private variable: balance
// Only allow deposit if amount > 0

import java.util.*;

class Condition_in_setter {
    private String name;
    private int balance;

    void setname(String name){
        this.name = name;
    }

    void setbalance(int amount){
        if(amount > 0){
            balance += amount;
            System.out.println("The amount ahs been added : " + balance);
        }
        else{
            System.out.println("Invalid amount!");
        }
    }

    String getname(){
        return name;
    }

    int getbalance(){
        return balance;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Bankacc ba = new Bankacc();
        System.out.print("Enter the name: ");
        ba.setname(sc.nextLine());
        System.out.print("Enter the Balance: ");
        ba.setbalance(sc.nextInt());

        System.out.println("The name is: " + ba.getname());
        System.out.println("The balance is: " + ba.getbalance());
    }
}