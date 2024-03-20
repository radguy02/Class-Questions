/*Design a class named Rectangle to represent a rectangle. The class contains:
>Two double data fields named width and height that specify the width and height
of the rectangle. The default values are 1 for both width and height.
>A no-arg constructor that creates a default rectangle.
>A constructor that creates a rectangle with the specified width and height.
>A method named getArea () that returns the area of this
>A method named getPerimeter () that returns the

Write a test program that creates two Rectangle objects one with width 4 and
height 40 and the other with width 3.5 and height 35.9. Display the width, height,
area, and perimeter of each rectangle in this order*/

package Programme;

class Rectangle{                    //Class created
    double width;
    double height;
    Rectangle(){                    //default rectangle constructor
        width=1;
        height=1;
    }
    Rectangle(double w, double h){      //constructor with argument 
        width = w; 
        height = h;
    }

    double getArea(){                   //method to return area
        return width*height;
    }

    double getPerimeter(){              //method to return perimeter
        return 2*(width + height);  
    }
}

public class Problem12 {
    public static void main(String[] args) {
        Rectangle default_rectangle = new Rectangle();
        Rectangle rec1 = new Rectangle(4, 40);
        Rectangle rec2 = new Rectangle(3.5, 35.9);

        System.out.println("Default Rectangle");
        System.out.println("Height: " + default_rectangle.height);
        System.out.println("Width: "+ default_rectangle.width);
        System.out.println("Area: "+ default_rectangle.getArea());
        System.out.println("Perimeter: " + default_rectangle.getPerimeter());
        System.out.println();
        System.out.println("Rectangle with user input.");
        System.out.println("Rectangle A");
        System.out.println("Height: " + rec1.height);
        System.out.println("Width: "+ rec1.width);
        System.out.println("Area: "+ rec1.getArea());
        System.out.println("Perimeter: " + rec1.getPerimeter());
        System.out.println();
        System.out.println("Rectangle B");
        System.out.println("Height: " + rec2.height);
        System.out.println("Width: "+ rec2.width);
        System.out.println("Area: "+ rec2.getArea());
        System.out.println("Perimeter: " + rec2.getPerimeter());
    }
}