// 🔹 1. Class Book

// Create a class Book with:

// attributes: title, author, price
// method to display book details

import java.util.*;

class Details{
    String title;
    String author;
    int price;

    void setDetails(String title, String author, int price){
        this.title = title;
        this.author = author;
        this.price = price;
    }

    String getTitle(){
        return title;
    }

    String getAuthor(){
        return author;
    }

    int getPrice(){
        return price;
    }
}

class Books{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Details b1 = new Details();
        String title;
        String author;
        int price;
        System.out.print("Enter the name of the book: ");
        title = sc.nextLine();
        System.out.print("Enter the Author of the book: ");
        author = sc.nextLine();
        System.out.print("Enter the price of the book: ");
        price = sc.nextInt();
        b1.setDetails(title,author,price);

        System.out.println("\n--- Book Details ---");
        System.out.println("Name of the book is: " + b1.getTitle());
        System.out.println("The name of the author is: " + b1.getAuthor());
        System.out.println("The price of the book is: " + b1.getPrice());
    }
}