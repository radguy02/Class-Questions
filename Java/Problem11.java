// Create a Java class named as Student with the following members and methods
// Members: register number, name, five marks and cgpa
// Methods: getInput , print, calculateCgpa

package Java;
import java.util.*;

class Student{
    Scanner input = new Scanner(System.in);
    int reg_num;
    String name;
    int Mark1;
    int Mark2; 
    int Mark3; 
    int Mark4; 
    int Mark5;
    double cgpa;

    void getInput(){
        System.out.println("Enter the name of the student: ");
        name = input.nextLine();
        System.out.print("Enter marks 1: ");
        Mark1 = input.nextInt();
        System.out.print("Enter marks 2: ");
        Mark2 = input.nextInt();
        System.out.print("Enter marks 3: ");
        Mark3 = input.nextInt();
        System.out.print("Enter marks 4: ");
        Mark4 = input.nextInt();
        System.out.print("Enter marks 5: ");
        Mark5 = input.nextInt();
    }
    
    double calculateCgpa(int a, int b, int c, int d, int e){
        cgpa = (double)(a+b+c+d+e)/50;
        return cgpa;
    }

    void print(){
        System.out.printf("Name of the student: %s\n", name);
        System.out.printf("Marks input by the user were:\n%d, %d, %d, %d, %d\n", Mark1, Mark2, Mark3, Mark4, Mark5);
        System.out.println("CGPA: " + calculateCgpa(Mark4, Mark3, Mark2, Mark1, Mark5));
    }
}

public class Problem11 {
    public static void main(String[] args) {
    Student obj = new Student();
    obj.getInput();
    obj.print();
    }
}