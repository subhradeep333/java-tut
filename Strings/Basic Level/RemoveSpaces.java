//Remove spaces from String
import java.util.*;
public class RemoveSpaces{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String words = sc.nextLine();
        String finalResult = "";
        for(int i =0; i<words.length(); i++){
            char ch = words.charAt(i);
            if (ch != ' '){
                finalResult += ch;
            }
        }
        System.out.println("Original String: "+ words);
        System.out.println("String after removing spaces: "+ finalResult);
    }
}