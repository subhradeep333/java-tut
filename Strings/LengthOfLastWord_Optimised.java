//Find the length of the last word- optimised solution
import java.util.*;
public class LengthOfLastWord_Optimised {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String words = sc.nextLine();
        int count = 0;
        int i = words.length() - 1;
        while(i>=0 && words.charAt(i)==' '){
            i-- ;
        }
        while(i>=0 && words.charAt(i) != ' '){
            count++ ;
            i-- ;
        }
        System.out.println("Length of last word is " + count);
    }
}
