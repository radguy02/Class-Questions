//Write a Java code to find the largest number in an array.

package Java;
import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int array_size = input.nextInt();

        int[] arr = new int[array_size];
        
        System.out.print("Enter the array elements: ");
        for(int i=0; i<array_size; i++){
            arr[i] = input.nextInt();
        }
        
        int largest_number = 0;

        for(int a: arr){
            if(a >= largest_number){
                largest_number = a;
            }
        }

    System.out.printf("The largest number in the array is %d\n",largest_number);
    input.close();
    }
}