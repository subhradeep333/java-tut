//Count the number of characters in java
import java.util.*;
public class CountChar{
    public static int counting(String s){
        int count =0;
        int i = 0;
        while(i< s.length()){
            if (s.charAt(i) != ' '){
                count++;
            }
            i++;
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String words = sc.nextLine();
        int n = counting(words);
        System.out.println("No of characters of string "+n);
    }
}