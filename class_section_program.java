//Isaiah McNeill
//CSC 151
//2-6-25
//Program made using ChatGPT
//Program explains class sections to user and even allows them to enter name

import java.util.Scanner;
import javax.swing.JOptionPane;

public class class_section_program 
{
    public static void main(String[] args) 
    {
        //declare scanner
        Scanner k = new Scanner(System.in);

        do
        {
            //get user's name
            String name = getName(k);
            showWelcome(name);
            String sectionNumber = getSectionNumber(k);
                
                //input for class section
                if (sectionNumber.length() == 4)
                {
                    char firstDigit = sectionNumber.charAt(0);
                    char secondDigit = sectionNumber.charAt(1);
                    String courseNumber = sectionNumber.substring(2);

                    String session = getSession(firstDigit);
                    String location = getLocation(secondDigit);
                    String classType = getCourseNumber(courseNumber);

                    displayResults(name, session, location, classType);

                    int choice = JOptionPane.showConfirmDialog(null, "Would you like to run the program again?", "Class Section Number", JOptionPane.YES_NO_OPTION);
                }
                else 
                {
                    JOptionPane.showMessageDialog(null, "Invalid input. Please enter a 4-character section numer", "Class Section Number", JOptionPane.ERROR_MESSAGE);
                }
            }
            while(choice == JOptionPane.YES_OPTION);

        
        
        

    }

    public static String getName(Scanner k)
    {
        return JOptionPane.showInputDialog(null, "Enter your name:", "User Input", JOptionPane.QUESTION_MESSAGE);
    }

    public static void showWelcome(String name)
    {
        JOptionPane.showMessageDialog(null, "Welcome to the program, " + name + "!", "Welcome Message", JOptionPane.INFORMATION_MESSAGE);     
    }

    public static String getSectionNumber(Scanner k)
    {
        return JOptionPane.showInputDialog(null, "Enter your section number:", "Class Section Number", JOptionPane.QUESTION_MESSAGE);
    }

    public static String getSession(char firstDigit)
    {
        return switch (firstDigit)
        {
            case '0' -> "16 Week";
            case '1' -> "1st Eight Week";
            case '2' -> "2nd Eight Week";
            case '3' -> "12 Week Session";
            case '5' -> "Off Cycle";
            case '6' -> "1st Four Week Session";
            case '7' -> "2nd Four Week Session";
            case '8' -> "3rd Four Week Session";
            case '9' -> "4th Four Week Session";
            default -> "Unknown";
        };
    }

    public static String getLocation(char secondDigit)
    {
        return switch (Character.toUpperCase(secondDigit)) {
            case '0' -> "Main Campus";
            case '1' -> "Fort Bragg";
            case '3' -> "Spring Lake Center";
            case '4' -> "Botanical Garden Center";
            case '9' -> "Online";
            case 'B' -> "Blended (Hybrid)";
            case 'C' -> "Collision";
            case 'D' -> "Developmental/Support Co-requisite";
            case 'F' -> "Flex";
            case 'H' -> "High School - County";
            case 'L' -> "Learning Communities";
            case 'P' -> "High School - Polytech";
            case 'R' -> "Ford";
            case 'V' -> "Virtual Classroom";
            case 'X' -> "Off Campus";
            case 'Y' -> "HyFlex";
            default -> "Unknown";
        };
    }

    public static String getCourseNumber(String courseNumber)
    {
        int num = Integer.parseInt(courseNumber);
        if (num == 01)
        {
            return "Day Class";
        }
        else if (num >= 1 && num <= 49) 
        {
            return "Day Class";
        } 
        else if (num >= 51 && num <= 59) 
        {
            return "Night Class";
        } 
        else if (num >= 61 && num <= 69) 
        {
            return "Weekend Class";
        } 
        else 
        {
            return "Unknown Class Type";
        }
    }

    public static void displayResults(String name, String session, String location, String classType)
    {
        JOptionPane.showMessageDialog(null, name + "\n" + "Session: " + session + "\n" + "Location/Type: " + location + "\n" + "Class Type: " + classType, "Class Section Number", JOptionPane.INFORMATION_MESSAGE);
    }
    

    
}