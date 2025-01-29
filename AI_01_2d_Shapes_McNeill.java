//Isaiah McNeill
//CSC-151
//1-28-25
//This program calculates area and circumference/perimeter of 2d shapes and compares them based off the results

import java.util.Scanner;

public class AI_01_2d_Shapes_McNeill 
{

    public static void main(String[] args) 
    {
        //allows input
        Scanner k = new Scanner(System.in);
        //calls to functions
        double length = getLength(k);
        double width = getWidth(k);
        double base = getBase(k);
        double height = getHeight(k);
        double lengthA = getLengthA(k);
        double lengthB = getLengthB(k);
        double radius = getRadius(k);
        
        double areaCircle = getAreaCircle(radius);
        double areaTriangle = getAreaTriangle(base, height);
        double areaQuad = getAreaQuad(length, width);
        double circumference = getCircumference(radius);
        double perimeterTriangle = getPerimeterTriangle(lengthA, lengthB, base);
        double perimeterQuad = getPerimeterQuad(length, width);

        displayResults(length, width, base, height, lengthA, lengthB, radius, areaCircle, areaTriangle, areaQuad, circumference, perimeterTriangle, perimeterQuad);
    }
   
    public static double getLength(Scanner k)
    {
        System.out.print("Enter the length of the quadrilateral: ");
        double length = k.nextDouble();

        return length;
    }

    public static double getWidth(Scanner k)
    {
        System.out.print("Enter the width of the quadrilateral: ");
        double width = k.nextDouble();

        return width;
    }

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
        System.out.print("Enter another side length of the triangle: ");
        double lengthB = k.nextDouble();

        return lengthB;
    }

    public static double getRadius(Scanner k)
    {
        System.out.print("Enter the radius of the circle: ");
        double radius = k.nextDouble();

        return radius;
    }

    public static double getAreaCircle(double radius)
    {
        double pi = 3.14159;
        
        return pi * (radius * radius);
    }


    public static double getAreaTriangle(double base, double height)
    {
        return base * height * 0.5;
    }

    public static double getAreaQuad(double length, double width)
    {
        return length * width;
    }

    public static double getCircumference(double radius)
    {
        double pi = 3.14159;

        return radius* 2 * pi;
    }

    public static double getPerimeterTriangle(double lengthA, double lengthB, double base)
    {
        return lengthA + lengthB + base;
    }

    public static double getPerimeterQuad(double length, double width)
    {
        return (length * 2) + (width * 2);
    }

    public static void displayResults(double length, double width, double base, double height, double lengthA, double lengthB, double radius, double areaCircle, double areaTriangle,double areaQuad, double circumference, double perimeterTriangle, double perimeterQuad)
    {
        System.out.println("The length and width of the quadrilateral is " + length + " and " + width);
        System.out.println("The base of the triangle is " + base + " and the height of the triangle is " + height);
        System.out.println("The other two side lengths of the triangle are " + lengthA + " and " + lengthB);
        System.out.println("The radius of the circle is " + radius);
        System.out.println("The area of the circle is " + areaCircle);
        System.out.println("The area of the triangle is " + areaTriangle);
        System.out.println("The area of the quadrilateral is " + areaQuad);
        System.out.println("The circumference of the circle is " + circumference);
        System.out.println("The perimeter of the triangle is " + perimeterTriangle);
        System.out.println("The perimeter of the quadrilateral is " + perimeterQuad);
    }

    //will probably use if statements to deermine the shape and to determine what specific results to display
    //will also use if statements for comparisons between area and perimeter/circumference
    
}