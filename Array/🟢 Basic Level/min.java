import java.util.*;

class min{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i < size; i++){
            System.out.print("The numbers are: ");
            sum = sum + arr[i];
            System.out.println(arr[i]);
        }
        System.out.println("the sum of elements are: " + sum);

        int min = arr[0];

        for (int i = 0; i < size; i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }
        System.out.print("The minimum element is: " + min);
    }
}