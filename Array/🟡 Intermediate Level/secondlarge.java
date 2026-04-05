import java.util.*;

class secondlarge{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }

        int large = arr[0];
        int secondlarge = arr[0];

        for(int i = 1; i < size; i++){
            if(arr[i] > large){
                secondlarge = large;
                large = arr[i];
            }
            else if (arr[i] > secondlarge && arr[i] != large){
                secondlarge = arr[i];
            }
        }

        System.out.print("The second large element is: " + secondlarge);
    }
}