import java.util.*;

class linear_search{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        int sum = 0;
        System.out.print("Enter the number to search: ");
        int search = sc.nextInt();

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

        for (int i = 0; i < size; i++){
            if (arr[i] == search){
                System.out.println("the number is at index: " + i);
            }
            else{
                System.out.println("The element is not found!");
            }
        }
    }
}