/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numberguesser;
import javax.swing.JOptionPane;


/**
 *
 * @author mcneilli4402
 */
public class NumberGuesser 
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
    
     public Integer process(String input) 
    {
        //-1 means error in progam
        Integer value = -1;
        //try  /catch
        //try catch is for unexpected things while if statements are for expected values
        try 
        {
             value = Integer.parseInt(input);
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
        NumberGuesser processor = new NumberGuesser();
        
        //variables
        int playerNumber;
        int low = 1;
        int high = 100;
        int guess = (low + high) / 2;
        final int TOO_LOW = 1;
        final int TOO_HIGH = 2;
        final int CORRECT = 3;
        boolean keepPlaying = true;
        
        while (keepPlaying)
        {
            // guess a number
            processor.say("Pick a number between 1 and 100 and I'll guess it");
            playerNumber = processor.getInteger();
            processor.say("I guess: " + guess);
            processor.say("Enter 1 for too low, 2 for too high, 3 for correct");
            Integer feedback = processor.getInteger();

            if (feedback == TOO_LOW)
            {
                low = guess; 
                guess = (low + high) / 2;
            }
            else if (feedback == TOO_HIGH)
            {
                high = guess;
                guess = (low + high) / 2;
            }
            else if (feedback == CORRECT)
            {
                processor.say("Computer wins!");
                keepPlaying = false;
                if (guess != playerNumber)
                {
                    processor.say("So you let me win huh...give me a challenge next time!");
                }
            }
            else 
            {
                processor.say("I don't even know what's happening any more -- adios!");
                keepPlaying = false;
            }
        }
    }
      
     public Integer getInteger() 
     {
        String userInput = JOptionPane.showInputDialog("Enter an integer:");
        Integer result = this.process(userInput); // only allow ints
        // Show the answer, or a decent error message
        if (result == -1) 
        {
            JOptionPane.showMessageDialog(null, userInput + " is not an Integer!");
            result = this.getInteger();
        }      
        return result;
     }
     
     public void say (String message)
     {
         JOptionPane.showMessageDialog(null, message);
     }
    
}
