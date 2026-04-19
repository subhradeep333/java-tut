//Find the length of last word
import java.util.*;
public class LengthOfLastWord{
    public static int calculate(String s){
        int count = 0;
        String snew = s.trim();
        for(int i = snew.length()-1; i>=0; i--){
            if(snew.charAt(i) != ' '){
                count++;
            }
            else{
                break;
            }
        }
        return count;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String sentence = sc.nextLine();
        int num = calculate(sentence);
        System.out.println("Length of last word: "+ num);
    }
}