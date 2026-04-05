import java.util.*;

class frequency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        int arr[] = new int[size];

        for (int i = 0; i < size; i++){
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }

        int j;
        int count = 0;

        for (int i = 0; i < size; i++){
            for (j = i + 1; j < size; j++){
                if (arr[i] == arr[j]){
                    count++;
                }
            }
        }
        System.out.print(count);
    }
}