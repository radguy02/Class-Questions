//Write a Java code to check whether the given string is palindrome or not

package Java;
import java.util.Scanner;

public class Problem6 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Enter the string: ");
    String str = input.next();
    str = str.toLowerCase();
    
    String str_rev = "";

    for(int a = str.length()-1; a>=0; a--){
        str_rev = str_rev + str.charAt(a);
    }
    //System.out.println(str_rev);

    if(str.equals(str_rev)){
        System.out.println("The entered string is a Plaindrome.");
    }
    else{
        System.out.println("The entered string is not a Palindrome");
    }

    input.close();
    }
}
