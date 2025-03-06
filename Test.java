import java.io.*;
import java.util.Scanner;

// By implementing Serializable interface
// we make sure that state of instances of class CharacterSheet
// can be saved in a file.

class CharacterSheet implements Serializable {
    private static final long serialVersionUID = 1L;
    
    //character stats
    int experience;
    String char_name;
    String char_class; // thief, mage, etc
    String player_name;
    int strength;
    int dexterity;
    int intelligence;

    // CharacterSheet class constructor
    public CharacterSheet(int experience, String char_name, String char_class, String player_name, int strength, int dexterity, int intelligence) {
        this.experience = experience;
        this.char_name = char_name;
        this.char_class = char_class;
        this.player_name = player_name;
        this.strength = strength;
        this.dexterity = dexterity;
        this.intelligence = intelligence;
    }
}

public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        // TODO: get all the info

        /*
        int steps = 100;
        String dogName = "Esther";
        String dogBreed = "Lab Mix";
        String owner = "norrisa";
        */
        // Ask the User to type the info

        /*
         //character stats
    int experience;
    String char_name;
    String char_class; // thief, mage, etc
    String player_name;
    int strength;
    int dexterity;
    int intelligence;
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the level of experience: ");
        int experience = scanner.nextInt();
        scanner.nextLine();  // Consume newline

        System.out.print("Enter the character name: ");
        String char_name = scanner.nextLine();

        System.out.print("Enter the character class: ");
        String char_class = scanner.nextLine();

        System.out.print("Enter the player's name: ");
        String player_name = scanner.nextLine();

        System.out.print("Enter the player's name: ");
        String strength = scanner.nextLine();

        System.out.print("Enter the player's name: ");
        String dexterity = scanner.nextLine();

        System.out.print("Enter the player's name: ");
        String intelligence = scanner.nextLine();
        // cleanup
        scanner.close();

        // Make the object
        CharacterSheet tracker = new CharacterSheet(experience, char_name, char_class, player_name, strength, dexterity, intelligence);
        // Write it to a file
        System.out.println("Writing file...");
        // Serializing 'tracker'
        FileOutputStream fos = new FileOutputStream("char_sheet.data");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(tracker);

        // De-serializing 'tracker'
        FileInputStream fis = new FileInputStream("char_sheet.data");
        ObjectInputStream ois = new ObjectInputStream(fis);
        CharacterSheet deserializedTracker = (CharacterSheet) ois.readObject(); // down-casting object
        System.out.println("Reading file...");
        System.out.println("Character Name: " + deserializedTracker.char_name + ", Experience: " + deserializedTracker.experience);
        System.out.println("Character Class: " + deserializedTracker.char_class);
        System.out.println("Player Name: " + deserializedTracker.player_name);
        System.out.println("Stats:");
        
        // TODO: print all the other data 
        // closing streams
        oos.close();
        ois.close();
    }
}

