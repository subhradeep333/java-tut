import java.util.*;

class reversearray{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int rev[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }

        System.out.println("The array is:");
        for (int i = 0; i < size; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        for(int i = 0; i < arr.length; i++){
            rev[i] = arr[arr.length - 1 - i ];
        }

        System.out.println("The reverse array is:");
        for(int i = 0; i < size; i++){
            System.out.print(rev[i] + " ");
        }
    }
}