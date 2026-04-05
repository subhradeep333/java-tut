import java.util.*;

class merge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = sc.nextInt();
        System.out.println("Enter the size: ");
        int size2 = sc.nextInt();
        int arr[] = new int[size];
        int arr2[] = new int[size2];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter the number:");
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < size2; i++) {
            System.out.print("Enter the number:");
            arr2[i] = sc.nextInt();
        }

        int m[] = new int[size + size2];

        for (int i = 0; i < size; i++) {
            m[i] = arr[i];
        }

        for (int i = 0; i < size2; i++) {
            m[size + i] = arr2[i];
        }

        for (int i = 0; i < size + size2; i++) {
            System.out.print(m[i] + " ");
        }

    }
}