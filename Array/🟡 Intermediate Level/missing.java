import java.util.*;

class missingnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size (n-1 elements): ");
        int size = sc.nextInt();

        int arr[] = new int[size];

        System.out.println("Enter elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        int n = size + 1;

        int expectedSum = n * (n + 1) / 2;

        int actualSum = 0;
        for (int i = 0; i < size; i++) {
            actualSum += arr[i];
        }

        int missing = expectedSum - actualSum;

        System.out.println("Missing number is: " + missing);
    }
}