/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jan21.sunojop.mcneill;
import javax.swing.JOptionPane;
/**
 *
 * @author Pranay Nepal(didn't save so I'm using his code with appropiate credit)
 */
public class Jan21SunoJOPMcNeill {

    public static void main(String[] args) 
    {
        String genre1, genre2, instru1, instru2, prompt = "";
        // say hello in JOptionPane
        // it's probably
        JOptionPane.showMessageDialog(null, "Suno Helper", "Greeting", JOptionPane.INFORMATION_MESSAGE);
        // what i want the program to do is
        // I can type in like "rap" and "phonk"
        // and it makes a string like this":
        // "rap, rap, rap, phonk"
        genre1 = JOptionPane.showInputDialog(null, "Enter a song genre: ", "Prompt", JOptionPane.QUESTION_MESSAGE);
        prompt += "Create a song with " + genre1 + " and ";
        genre2 = JOptionPane.showInputDialog(null, "Enter another song genre: ", "Prompt", JOptionPane.QUESTION_MESSAGE);
        prompt += genre2 + " and ";
        instru1 = JOptionPane.showInputDialog(null, "Enter an instrument: ", "Prompt", JOptionPane.QUESTION_MESSAGE);
        prompt += "play the song with " + instru1 + ".";
        JOptionPane.showMessageDialog(null, prompt);
    }
}
