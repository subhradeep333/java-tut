//reverse a string
import java.util.*;
public class RevString{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String word = sc.nextLine();
        System.out.println("original string "+ word);
        char[] arr = word.toCharArray();
        int left = 0;
        int right = word.length() - 1;
        while(left < right){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right-- ; 
        }
        System.out.println("reversed string "+ new String(arr));
        }
}
