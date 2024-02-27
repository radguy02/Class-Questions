//Write a Java code to find all pairs of elements whose sum is equal to the given value.

package Java;
import java.util.Scanner;

public class Problem4 {
    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of array: ");
        int array_size = input.nextInt();

        int[] arr = new int[array_size];

        System.out.print("Enter the array elements: ");
        for(int i=0; i<array_size; i++){
            arr[i] = input.nextInt();
        }

        System.out.print("Enter the sum: ");
        int sum = input.nextInt();

        for(int a = 0; a<arr.length; a++){
            for(int b = a+1; b<arr.length; b++){
                if(arr[a]+arr[b]== sum){
                    System.out.println(arr[a]+" "+arr[b]);
                }
            }
        }
    input.close();
    }
}