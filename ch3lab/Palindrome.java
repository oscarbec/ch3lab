
/**
 * Write a description of class Palindrome here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Palindrome
{
    public static void main(String[] args){
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Whats the word");
    String word = scan.nextLine();
    int index1 = 0;
    int index2 = word.length() - 1;
    
    
    
    while (index2 > index1) {
        if (word.charAt(index1) != word.charAt(index1)) {
            System.out.println("Not a palindrome");
        }
        ++index1;
        --index2;
    }
    System.out.println("Is a palindrome");
}
    
    }

