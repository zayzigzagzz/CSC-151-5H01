/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package isaiahmcneill_hellogoodbye_013025;
import javax.swing.JOptionPane; //allows display
import java.util.Scanner; //allows input from user

/**
 *
 * @author mcneilli4402
 */
public class IsaiahMcNeill_HelloGoodbye_013025 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        //input
        Scanner k = new Scanner(System.in);
        //call methods
        String name = getName(k);
        showWelcome(name);
        showGoodbye(name);
    }
    
    public static String getName(Scanner k)
    {
        return JOptionPane.showInputDialog(null, "Enter your name:", "User Input", JOptionPane.QUESTION_MESSAGE);
    }
    
    public static void showWelcome(String name)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the program, " + name + "!", "Welcome Message", JOptionPane.INFORMATION_MESSAGE);     
    }
    
    public static void showGoodbye(String name)
    {
        JOptionPane.showMessageDialog(null, "Goodbye, " + name + "!", "Goodbye Mesage", JOptionPane.INFORMATION_MESSAGE);
    }
    
    
    
    
        
}
    
