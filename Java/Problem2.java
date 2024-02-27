//Write a Java code to find the number of occurrences of a given number in an array.

package Java;
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int array_size = input.nextInt();

        int[] arr = new int[array_size];
        
        System.out.print("Enter the array elements: ");
        for(int i=0; i<array_size; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the number to search: ");
        int search_elem = input.nextInt();

        int count = 0;

        for(int a: arr){
            if(a == search_elem){
                count++;
            }
        }
    System.out.printf("%d occured %d time in the array given.\n", search_elem, count);
    
    input.close();
    }
}
