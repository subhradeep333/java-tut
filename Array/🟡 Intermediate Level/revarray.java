import java.util.*;

class revarray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the numbers: ");
            arr[i] = sc.nextInt();
        }

        System.out.print("the array is: ");
        for (int i = 0; i <size; i++){
            System.out.print(arr[i] + " ");
        }

        
        for (int i = 0; i < size; i++){
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[i] = temp;
        }

        System.out.println("the reverse array is: ");
        for (int i = 0; i< size; i++){
            System.out.print(arr[i] + " ");
        }
    }
}