import java.util.*;

class basic{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print("The numbers are: ");
            System.out.println(arr[i]);
        }
    }
}