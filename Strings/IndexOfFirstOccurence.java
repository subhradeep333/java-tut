//Find the index of first occurence in a string. if not found -1
import java.util.*;
public class IndexOfFirstOccurence{
    public static int finding(String s, String ch){
       for(int i = 0; i < s.length() - ch.length() + 1 ; i++){
        if(s.charAt(i) == ch.charAt(0)){
            if(s.substring(i, ch.length()+i).equals(ch)){
                return i;
            }
        } 
       }
       return -1 ;   
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String words = sc.nextLine();
        System.out.println("Enter target to find: ");
        String target = sc.nextLine();
        int ind = finding(words, target);
        System.out.println("target's first occurence is at " + ind);
    }
}