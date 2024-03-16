//Input an array, sum of all elements of a array, sum of two arrays, matrix multiplication, display array

package Java;
import java.util.Scanner;

public class Problem7 {
    public static int[][] getArray(){                       //take input as array
        @SuppressWarnings("resource")
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int row = input.nextInt();
        System.out.print("Enter the number of columns: ");
        int column = input.nextInt();
        
        int[][] arr = new int[row][column];                  //initialize array
        System.out.println("Enter " + arr.length + " rows and " + arr[0].length + " columns:");
        for(int i =0; i<arr.length; i++){                    //input array elements
            for(int j = 0; j<arr[i].length; j++){
                arr[i][j] = input.nextInt();
            }
        }                                      
        return arr;
        }    

    public static int sum(int[][] var){                      //sum method
        int sum = 0;
        for(int i = 0; i<var.length; i++){
            for(int j = 0; j<var[i].length; j++){
                sum += var[i][j];
            }
        }
        return sum;
    }

    public static void display(int[][] var){                 //displays a 2-D array 
        for(int i=0; i<var.length; i++){
            for(int j=0; j<var[i].length; j++){
                System.out.print(var[i][j]+" ");
            }
        System.out.println();
        }
    }

    public static int[][] add_two_arrays(int[][]a, int[][]b){
        if (a.length != b.length || a[0].length != b[0].length) {
            throw new IllegalArgumentException("Matrices must have the same dimensions for addition.");
        }

        int[][] added = new int[a.length][a[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                added[i][j] = a[i][j] + b[i][j];
            }
        }
        return added;
    }

    public static int[][] diff_two_arrays(int[][]a, int[][]b){
        if(a.length!=b.length || a[0].length!=b[0].length){
            throw new IllegalArgumentException("Matrices must have same dimensions for substraction.");
        }

        int[][] difference = new int[a.length][a.length];
        for(int i=0; i<a.length; i++){
            for(int j=0; j<a[i].length; j++){
                difference[i][j] = a[i][j] - b[i][j];
            }
        }
        return difference;
    }

    public static int max(int[][] a){
        int max = 0;

        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                if(max<a[i][j]){
                    max = a[i][j];
                }
            }
        }
        return max;
    }

    public static int min(int[][]a){
        int min = a[1][1];

        for(int i=0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                if(min>a[i][j]){
                    min = a[i][j];
                }
            }
        }
        return min;
    }

    public static int[][] multiplication(int[][]a, int[][]b){
        if (a[0].length != b.length){
            throw new IllegalArgumentException("Matrices can not be multiplied.");
        }

        int[][] multiple = new int[a.length][b[0].length];
        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k=0; k<a[i].length; k++){
                multiple[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return multiple;
    }
    public static void main(String[] args){
        int[][]arr_a = getArray();
        int[][]arr_b = getArray();

        System.out.println("Matrix A: ");
        display(arr_a);
        System.out.println("Sum of all the elements of Matrix A: " + sum(arr_a));

        System.out.println("Matrix B: ");
        display(arr_b);
        System.out.println("Sum of all the elements of Matrix B: " + sum(arr_b));

        System.out.println("Sum of both the arrays: ");
        display(add_two_arrays(arr_a,arr_b));

        System.out.println("Difference of both arrays: ");
        display(diff_two_arrays(arr_a, arr_b));

        System.out.println("Matrix multiplication of both the arrays: ");
        display(multiplication(arr_a, arr_b));

        System.out.println("Largest element in Matrix A: ");
        System.out.println(max(arr_a));

        System.out.println("Smallest element in Matrix A: ");
        System.out.println(min(arr_a));
    }
}