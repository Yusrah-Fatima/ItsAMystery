import java.util.*;
public class CharacterCreation {
    
      // Method for character creation
      public static void createCharacter() {

        Scanner log=new Scanner(System.in);
        System.out.println("Enter your character's name:");
        String characterName = log.nextLine();
        
        System.out.println("Enter your character's age:");

        int characterAge = log.nextInt();

        log.nextLine(); // consume newline
        
        System.out.println("Enter your character's gender:");

        String characterGender = log.nextLine();

        System.out.println("Select your character's race/ethnicity:");

        System.out.println("1. Red");
        System.out.println("2. Blue");
        System.out.println("3. Green");
        System.out.println("4. Yellow");
        
        String characterRace = "";
        
        int raceChoice = log.nextInt();

        log.nextLine(); // consume newline
        
        switch (raceChoice) {
            case 1:
                characterRace = "Red";
                break;
            case 2:
                characterRace = "Blue";
                break;
            case 3:
                characterRace = "Green";
                break;
            case 4:
                characterRace = "Yellow";
                break;
            default:
                System.out.println("Invalid choice. Defaulting to 'Red'.");
                characterRace = "Red";
                break;
        }

        System.out.println("Congratulations, " + characterName + "!");
        System.out.println("Details:");
        System.out.println("Name: " + characterName);
        System.out.println("Age: " + characterAge);
        System.out.println("Gender: " + characterGender);
        System.out.println("Race/Ethnicity: " + characterRace);       
        System.out.println("Congratulations, " + characterName + "!");
    }

}