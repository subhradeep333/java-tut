import java.util.*;

class odd_even{
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
        int poscount = 0;
        int negcount = 0;

        for (int i = 0; i < size; i++){
            if (arr[i] % 2 == 0){
                System.out.println("The even number is: " + arr[i]);
                poscount += 1;
                 
            }
            else{
                System.out.println("The odd number is: " + arr[i]);
                negcount += 1;
            }
        }

        System.out.println("----------------------");
        System.out.println("the even number is: " + poscount);
        System.out.println("the odd number is: " + negcount);
        System.out.println("----------------------");
    }
}