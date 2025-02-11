/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numberprocessor_mcneill;
import javax.swing.JOptionPane;

/**
 *
 * @author mcneilli4402
 */
public class NumberProcessor_McNeill 
{
    /**
     * Processes a string input and attempts to convert it to an integer.
     * This method demonstrates basic input validation and error handling.
     * 
     * Things to consider:
     * 1. What should happen if the user enters nothing?
     * 2. What should happen if the user enters "abc"?
     * 3. What should happen if the user enters "3.14"?
     * 
     * @param input The string that should be converted to an integer
     * @return A message describing what happened during processing
     */
    public Integer process(String input, Boolean isDouble) 
    {
        //boolean is double - if we give true as 2nd input, then give us number
        //-1 means error in progam
        Integer value = -1;
        //try  /catch
        //try catch is for unexpected things while if statements are for expected values
        try 
        {
            if(isDouble)
            {
                //convert String to Double
                Double dValue = Double.parseDouble(input);
                //convertDouble to integer
                value = dValue.intValue();
            }
            else
            {
                value = Integer.parseInt(input);
            }

        }
        catch (NumberFormatException e)
        {
            System.err.println(input + " is not an Integer!");
        }
        //string to int
        
        return value;
    }

    public static void main(String[] args) 
    {
        //turn class into object so its useable
        NumberProcessor_McNeill processor = new NumberProcessor_McNeill();
        
        // Test Case 1: Ask for a number
        String userInput = JOptionPane.showInputDialog("Enter a whole number (such as 69):");
        Integer result = processor.process(userInput, false); //allow for integers
        //show answer, or a decent error message
        if(result != -1)
        {
            JOptionPane.showMessageDialog(null, result);
        }
        else
        {
            JOptionPane.showMessageDialog(null, userInput + " is not an Integer!");
        }
        // Test Case 2: What happens with invalid input?
        userInput = JOptionPane.showInputDialog("Try entering something that isn't a whole number (3.14):");
        result = processor.process(userInput, true); //allow for double
        //shwo answer, or a decent error message
        if(result != -1)
        {
            JOptionPane.showMessageDialog(null, result);
        }
        else
        {
            JOptionPane.showMessageDialog(null, userInput + " is not an Integer!");
        }
    }
}
