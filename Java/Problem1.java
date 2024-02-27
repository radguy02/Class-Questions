//Write a Java code to search a given number in an array

package Java;
import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args){
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

        boolean flag = true;

        for(int a :arr){
            if(a == search_elem){
                System.out.printf("%d is present in the array given.\n", search_elem);
                flag = false;
            }
        }
        if(flag){
            System.out.printf("%d is not present in the array given.\n", search_elem);
        }
    input.close();
    }
}
