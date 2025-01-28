/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isaiahmcneill_arearec_11625_5h01;
import javax.swing.JOptionPane;

/**
 *
 * @author mcneilli4402
 */
public class IsaiahMcNeill_AreaRec_11625_5H01
{
//wise to create variables outside of the main but within the class
public static double length,width, area;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // Step 1: Get user input for the rectangle's length and width
        String lengthInput = JOptionPane.showInputDialog("Enter the length of the rectangle:");
        String widthInput = JOptionPane.showInputDialog("Enter the width of the rectangle:");

        // Convert the inputs to double (since length and width can be decimals)
        double length = Double.parseDouble(lengthInput);
        double width = Double.parseDouble(widthInput);

        // Step 2: Call the functions to calculate area and perimeter
        double area = calculateArea(length, width);

        // Step 3: Display the results using JOptionPane
        String resultMessage = "For a rectangle with length " + length + " and width " + width + ":\n";
        resultMessage += "Area: " + area + "\n";
        JOptionPane.showMessageDialog(null, resultMessage);
    }
    
    // Function to calculate the area of the rectangle
    public static double calculateArea(double length, double width) 
    {
        return length * width;
    }
  
}

