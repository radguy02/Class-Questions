// Write a program that prompts the user to enter the x and y coordinates of
// the three corner points in a triangle and then displays the triangle's angles.

package Programme;
import java.lang.Math;
import java.util.*;

public class Problem13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x1, x2, x3, y1, y2, y3;
        double A,B,C;
        double a,b,c;

        System.out.println("Enter the coordinates of the triangle in the order: ");
        System.out.print("x1: ");
        x1=input.nextInt();
        System.out.print("y1: ");
        y1=input.nextInt();
        System.out.print("x2: ");
        x2=input.nextInt();
        System.out.print("y2: ");
        y2=input.nextInt();
        System.out.print("x3: ");
        x3=input.nextInt();
        System.out.print("y3: ");
        y3=input.nextInt();

        //Calculating length of sides
        a=Math.sqrt(Math.pow(x3-x2,2)+Math.pow(y3-y2,2));
        b=Math.sqrt(Math.pow(x3-x1,2)+Math.pow(y3-y1,2));        
        c=Math.sqrt(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));

        //Calculating angles
        A=Math.acos((Math.pow(a,2)-Math.pow(b,2)-Math.pow(c,2))/(-2*b*c));
        B=Math.acos((Math.pow(b,2)-Math.pow(a,2)-Math.pow(c,2))/(-2*a*c));
        C=Math.acos((Math.pow(c,2)-Math.pow(b,2)-Math.pow(a,2))/(-2*b*a));

        System.out.println("Angle A: " + Math.toDegrees(A));
        System.out.println("Angle B: " + Math.toDegrees(B));
        System.out.println("Angle C: " + Math.toDegrees(C));

        input.close();
    }
}
