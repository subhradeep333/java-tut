import java.util.*;

class max{
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

        int max = arr[0];

        for (int i = 0; i < size; i++){
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.print("the max element is: " + max);
        
    }
}