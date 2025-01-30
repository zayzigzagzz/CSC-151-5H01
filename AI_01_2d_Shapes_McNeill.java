//Isaiah McNeill
//CSC-151
//1-28-25
//This program calculates area and circumference/perimeter of 2d shapes and compares them based off the results

import java.util.Scanner;

public class AI_01_2d_Shapes_McNeill 
{

    public static void main(String[] args) 
    {
        runCode();
    }

    public static void runCode()
    {
        //allows input
        Scanner k = new Scanner(System.in);

        //will be used for menu selection
        int choice;

        //variables that'll help me compare current and previous shape
        double preArea = -1;
        double prePerimeter = -1;

        //do while loop for menu that lets program end once certain parameter is met
        do 
            {
                System.out.println("=== Shape Selection Menu ===");
                //System.out.println("(Select two shapes and then select calculate)");
                System.out.println("1. Circle");
                System.out.println("2. Triangle");
                System.out.println("3. Sqaure");
                System.out.println("4. Rectangle");
                System.out.println("5. Exit");
                //System.out.println("6. Calculate");
                System.out.print("Select a key labeled 1 through 5: ");

                choice = k.nextInt();

                //case structure to choose shape based off inputed number
                //along with the functions based on the corresponding shape
                switch (choice) 
                {
                    case 1:
                        System.out.println("You selected Circle!");
                        double radius = getRadius(k);
                        double circleArea = getAreaCircle(radius);
                        double circumference = getCircumference(radius);
                        displayCircle(circleArea, circumference);
                        break;
                
                    case 2:
                        System.out.println("You selected Triangle!");
                        double base = getBase(k);
                        double height = getHeight(k);
                        double lengthA = getLengthA(k);
                        double lengthB = getLengthB(k);
                        double triangleArea = getAreaTriangle(base, height);
                        double trianglePerimeter = getPerimeterTriangle(lengthA, lengthB, base);
                        displayTriangle(triangleArea,trianglePerimeter);

                        break;
                    
                    case 3:
                        System.out.println("You selected Square!");
                        double length = getLength(k);
                        double width = getWidth(k);
                        double sqaureArea = getAreaQuad(length, width);
                        double squarePerimeter = getPerimeterQuad(length, width);
                        displaySquare(sqaureArea, squarePerimeter);
                        break;

                    case 4:
                        System.out.println("You selected Rectangle!");
                        double recLength = getRecLength(k);
                        double recWidth = getRecWidth(k);
                        double rectangleArea = getAreaQuad(recLength, recWidth);
                        double recanglePerimeter = getPerimeterQuad(recLength, recWidth);
                        displayRectangle(rectangleArea, recanglePerimeter);
                        break;

                    case 6:

                        break;
                    
                    case 5:
                        System.out.println("Program has ended!");
                        break;


                    default:
                        System.out.println("Not a valid option. Please try again.");

                }
                //this is where if statements go, aka outside the case structure and in the do part of the do while
            } 
        
        while (choice != 5);       
    }

    //circle info
    public static double getRadius(Scanner k)
    {
        System.out.print("Enter the radius of the circle: ");
        double radius = k.nextDouble();

        return radius;
    }

    public static double getAreaCircle(double radius)
    {  
        return Math.PI * (radius * radius);
        //if you want to control decimal points either use formatting or declare and initialize variable "pi" to 3.14/3.141/etc
    }

    public static double getCircumference(double radius)
    {
        return radius* 2 * Math.PI;
        //if you want to control decimal points either use formatting or declare and initialize variable "pi" to 3.14/3.141/etc
    }

    public static void displayCircle(double circleArea, double circumference)
    {
        System.out.println("The area is " + circleArea + ".");
        System.out.println("The circumference is " + circumference + ".");
    }

    //triangle info
    public static double getBase(Scanner k)
    {
        System.out.print("Enter the base of the triangle: ");
        double base = k.nextDouble();

        return base;
    }

    public static double getHeight(Scanner k)
    {
        System.out.print("Enter the height of the triangle: ");
        double height = k.nextDouble();

        return height;
    }

    public static double getLengthA(Scanner k)
    {
        System.out.print("Enter one of the side lengths of the triangle: ");
        double lengthA = k.nextDouble();

        return lengthA;
    }

    public static double getLengthB(Scanner k)
    {
        System.out.print("Enter the other side length of the triangle: ");
        double lengthB = k.nextDouble();

        return lengthB;
    }

    public static double getAreaTriangle(double base, double height)
    {
        return base * height * 0.5;
    }

    public static double getPerimeterTriangle(double lengthA, double lengthB, double base)
    {
        return lengthA + lengthB + base;
    }

    public static void displayTriangle(double triangleArea, double trianglePerimeter)
    {
        System.out.println("The area is " + triangleArea + ".");
        System.out.println("The perimeter is " + trianglePerimeter + ".");
    }

    //square info
    public static double getLength(Scanner k)
    {
        System.out.print("Enter the length of the square: ");
        double length = k.nextDouble();

        return length;
    }

    public static double getWidth(Scanner k)
    {
        System.out.print("Enter the width of the square: ");
        double width = k.nextDouble();

        return width;
    }

    public static double getAreaQuad(double length, double width)
    {
        return length * width;
    }
    
    public static double getPerimeterQuad(double length, double width)
    {
        return (length * 2) + (width * 2);
    }

    public static void displaySquare(double squareArea, double squarePerimeter)
    {
        System.out.println("The area is " + squareArea + ".");
        System.out.println("The perimeter is " + squarePerimeter + ".");
    }

    //rectangle info
    public static double getRecLength(Scanner k)
    {
        System.out.print("Enter the length of the rectangle: ");
        double length = k.nextDouble();

        return length;
    }

    public static double getRecWidth(Scanner k)
    {
        System.out.print("Enter the width of the rectangle: ");
        double width = k.nextDouble();

        return width;
    }

    public static void displayRectangle(double rectangleArea, double rectanglePerimeter)
    {
        System.out.println("The area is " + rectangleArea + ".");
        System.out.println("The perimeter is " + rectanglePerimeter + ".");

    }
    
}