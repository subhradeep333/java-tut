import java.util.*;

class sort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number: ");
            arr[i] = sc.nextInt();
        }

        boolean issorted = true;

        for (int i = 0; i < size - 1; i++){
            if (arr[i] > arr[i + 1]){
                issorted = false;
                break;
            }
        }

        if (issorted){
            System.out.println("The array is sorted in ascending order");
        }
        else{
            System.out.println("The array is not sorted");
        }
    }
}