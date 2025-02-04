//Isaiah McNeill
//CSC-151
//1-28-25
//This program calculates area and circumference/perimeter of 2d shapes and compares them based off the results

import java.util.Scanner;
import javax.swing.JOptionPane;

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
                JOptionPane.showMessageDialog(null, "Select Your Shape", "▲●■Shape Selection Menu▲●■", JOptionPane.INFORMATION_MESSAGE);
                JOptionPane.showMessageDialog(null, "Select a key labeled 1 through 5", null, JOptionPane.INFORMATION_MESSAGE);
                System.out.println("1. Circle ●");
                System.out.println("2. Triangle ▲");
                System.out.println("3. Sqaure ■");
                System.out.println("4. Rectangle ▮");
                System.out.println("5. Exit");

                choice = k.nextInt();

                //store area and perimeter
                double area = 0, perimeter = 0;

                //case structure to choose shape based off inputed number
                //along with the functions based on the corresponding shape
                switch (choice) 
                {
                    case 1:
                        int option1 = JOptionPane.showConfirmDialog(null, "You selected Circle! Is this your shape?", "▲●■Shape Selection Menu▲●■", JOptionPane.YES_NO_OPTION);
                        
                        if (option1 == JOptionPane.YES_OPTION)
                        {
                            double radius = getRadius(k);
                            double circleArea = getAreaCircle(radius);
                            double circumference = getCircumference(radius);
                            displayCircle(circleArea, circumference);
                            area = circleArea;
                            perimeter = circumference;
    
                            break;                           
                        } 
                        
                        else if (option1 == JOptionPane.NO_OPTION) 
                        {
                            JOptionPane.showMessageDialog(null, "Restarting Program!", "▲●■Shape Selection Menu▲●■", JOptionPane.ERROR_MESSAGE);
                            runCode();
                        }        
                
                    case 2:
                        int option2 = JOptionPane.showConfirmDialog(null, "You selected Triangle!", "▲●■Shape Selection Menu▲●■", JOptionPane.YES_NO_OPTION);

                        if (option2 == JOptionPane.YES_OPTION)
                        {
                            double base = getBase(k);
                            double height = getHeight(k);
                            double lengthA = getLengthA(k);
                            double lengthB = getLengthB(k);
                            double triangleArea = getAreaTriangle(base, height);
                            double trianglePerimeter = getPerimeterTriangle(lengthA, lengthB, base);
                            displayTriangle(triangleArea,trianglePerimeter);
                            area = triangleArea;
                            perimeter = trianglePerimeter;

                            break;
                        }

                        else if (option2 == JOptionPane.NO_OPTION)
                        {
                            JOptionPane.showMessageDialog(null, "Restarting Program!", "▲●■Shape Selection Menu▲●■", JOptionPane.ERROR_MESSAGE);
                            runCode();
                        }
                        
                    
                    case 3:
                        int option3 = JOptionPane.showConfirmDialog(null, "You selected Square", "▲●■Shape Selection Menu▲●■", JOptionPane.YES_NO_OPTION);

                        if (option3 == JOptionPane.YES_OPTION) 
                        {
                            double length = getLength(k);
                            double width = getWidth(k);
                            double sqaureArea = getAreaQuad(length, width);
                            double squarePerimeter = getPerimeterQuad(length, width);
                            displaySquare(sqaureArea, squarePerimeter);
                            area = sqaureArea;
                            perimeter = squarePerimeter;

                            break;
                        }

                        else if (option3 == JOptionPane.NO_OPTION)
                        {
                            JOptionPane.showMessageDialog(null, "Restarting Program!", "▲●■Shape Selection Menu▲●■", JOptionPane.ERROR_MESSAGE);
                            runCode();
                        }

                    case 4:
                        int option4 = JOptionPane.showConfirmDialog(null, "You selected Rectangle!", "▲●■Shape Selection Menu▲●■", JOptionPane.YES_NO_OPTION);

                        if (option4 == JOptionPane.YES_OPTION) 
                        {
                            double recLength = getRecLength(k);
                            double recWidth = getRecWidth(k);
                            double rectangleArea = getAreaQuad(recLength, recWidth);
                            double recanglePerimeter = getPerimeterQuad(recLength, recWidth);
                            displayRectangle(rectangleArea, recanglePerimeter);
                            area = rectangleArea;
                            perimeter = recanglePerimeter;
    
                            break;
                        }

                        else if (option4 == JOptionPane.NO_OPTION)
                        {
                            JOptionPane.showMessageDialog(null, "Restarting Program!", "▲●■Shape Selection Menu▲●■", JOptionPane.ERROR_MESSAGE);
                            runCode();
                        }
                        

                    case 5:
                        JOptionPane.showMessageDialog(null, "Program has ended!", "▲●■Shape Selection Menu▲●■", JOptionPane.INFORMATION_MESSAGE);
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Not a valid option. Please try again.");
                        JOptionPane.showMessageDialog(null, "Not a valid option. Please try again.", "▲●■Shape Selection Menu▲●■", JOptionPane.INFORMATION_MESSAGE);

                }
                //this is where if statements go, aka outside the case structure and in the do part of the do while
                if (preArea != -1 && prePerimeter != -1) 
                {
                    JOptionPane.showMessageDialog(null, "Comparison with Previous Shape", "▲●■Shape Selection Menu▲●■ ", JOptionPane.INFORMATION_MESSAGE);
                
                        if (area > preArea) 
                        {
                            JOptionPane.showMessageDialog(null, "Current shape has a larger area.", "Shape Comparison", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if (area < preArea) 
                        {
                            JOptionPane.showMessageDialog(null, "Previous shape had a larger area.", "Shape Comparison", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else 
                        {
                            JOptionPane.showMessageDialog(null, "Both shapes have the same area.", "Shape Comparison", JOptionPane.INFORMATION_MESSAGE);
                        }

                        if (perimeter > prePerimeter)
                        {
                            JOptionPane.showMessageDialog(null, "Current shape has a larger perimeter.", "Shape Comparison", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else if(perimeter < prePerimeter)
                        {
                            JOptionPane.showMessageDialog(null, "Previous shape had a larger perimeter.", "Shape Comparison", JOptionPane.INFORMATION_MESSAGE);
                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Both shaapes have the same perimeter.", "Shape Comparison", JOptionPane.INFORMATION_MESSAGE);
                        }
                }
                
                    preArea = area;
                    prePerimeter = perimeter;
            }
           
        
        while (choice != 5);       
    }

    //circle info
    public static double getRadius(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the radius of the circle", "Circle ●", JOptionPane.QUESTION_MESSAGE);
        double radius = Double.parseDouble(input);

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
        JOptionPane.showMessageDialog(null, "The area is " + circleArea + ".", "Circle ●", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The circumference is " + circumference + ".", "Circle ●", JOptionPane.INFORMATION_MESSAGE);
    }

    //triangle info
    public static double getBase(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the base of the triangle:", "Triangle ▲", JOptionPane.QUESTION_MESSAGE);
        double base = Double.parseDouble(input);

        return base;
    }

    public static double getHeight(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the height of the triangle:", "Triangle ▲", JOptionPane.QUESTION_MESSAGE);
        double height = Double.parseDouble(input);

        return height;
    }

    public static double getLengthA(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter one of the two remaining side lengths of the triangle:", "Triangle ▲", JOptionPane.QUESTION_MESSAGE);
        double lengthA = Double.parseDouble(input);

        return lengthA;
    }

    public static double getLengthB(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the final side length of the triangle:", "Triangle ▲", JOptionPane.QUESTION_MESSAGE);
        double lengthB = Double.parseDouble(input);

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
        JOptionPane.showMessageDialog(null, "The area is " + triangleArea + ".", "Triangle ▲", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The perimeter is " + trianglePerimeter + ".", "Triangle ▲", JOptionPane.QUESTION_MESSAGE);
    }

    //square info
    public static double getLength(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the length of the square:", "Sqaure ■", JOptionPane.QUESTION_MESSAGE);
        double length = Double.parseDouble(input);

        return length;
    }

    public static double getWidth(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the width of the sqaure:", "Sqaure ■", JOptionPane.QUESTION_MESSAGE);
        double width = Double.parseDouble(input);

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
        JOptionPane.showMessageDialog(null, "The area is " + squareArea + ".", "Sqaure ■", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The perimeter is " + squarePerimeter + ".", "Sqaure ■", JOptionPane.INFORMATION_MESSAGE);
    }

    //rectangle info
    public static double getRecLength(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the length of the rectangle:", "Rectangle ▮", JOptionPane.QUESTION_MESSAGE);
        double length = Double.parseDouble(input);

        return length;
    }

    public static double getRecWidth(Scanner k)
    {
        String input = JOptionPane.showInputDialog(null, "Enter the width of the rectangle:", "Rectangle ▮", JOptionPane.QUESTION_MESSAGE);
        double width = Double.parseDouble(input);

        return width;
    }

    public static void displayRectangle(double rectangleArea, double rectanglePerimeter)
    {
        JOptionPane.showMessageDialog(null, "The area is " + rectangleArea + ".", "Rectangle ▮", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "The perimeter is " + rectanglePerimeter, null, JOptionPane.INFORMATION_MESSAGE);

    }
    
}