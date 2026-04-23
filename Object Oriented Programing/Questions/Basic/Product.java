// 🔹 2. Class Product
// attributes: id, name, price
// method to apply discount

import java.util.*;

class Details{
    int id;
    String name;
    int price;
    int percentage;

    void setDetails(int id, String name,int price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId(){
        return id;
    }

    String getname(){
        return name;
    }

    int getprice(){
        return price;
    }

    int discount(int percentage){
        int discountAmount = price * percentage / 100;
        return price - discountAmount;
    }
}

class Product{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int id;
        String name;
        int price;
        int percentage;
        System.out.print("Enter the id of the product: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter the name of the product: ");
        name = sc.nextLine();
        System.out.print("Enter the price of the product: ");
        price = sc.nextInt();
        System.out.print("Enter the discount of the product: ");
        percentage = sc.nextInt();

        Details d1 = new Details();
        d1.setDetails(id,name,price);

        System.out.println("\n--- Product Details ---");
        System.out.println("The id of the product: " + d1.getId());
        System.out.println("The name of the product is: " + d1.getname());
        System.out.println("The price of the product is: " + d1.getprice());
        System.out.println("The amount payable is: " + d1.discount(percentage));
    }
}