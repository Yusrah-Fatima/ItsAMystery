import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;

public class GameIntroduction {
    public static final String RESET = "\u001B[0m";
    public static final String BLUE = "\u001B[36m";
    //method for game beginning and op asccii art
    public static void intro(String fileName) {
        Scanner log= new Scanner(System.in);
        try {
            File file = new File(fileName);
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String data = scanner.nextLine();
                System.out.println(BLUE + data + RESET);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Sorry, an error has occurred.");
            e.printStackTrace();
        }
        System.out.println("Tap enter to proceed");
        {String ent;
        ent=log.nextLine();
        System.out.println("Welcome to this wonderful game created by an absolutely wonderful person");
        System.out.println("first of all this game is quite random and it is just a mode of venting out stress");
        System.out.println("after a long day of work. ");
        System.out.println("I know how it feels after that long shift so just relax and");
        System.out.println("enjoy this little piece of work");
        System.out.println("Cheers mate :in other words thank you.");
        System.out.println("DISCLAIMER: I do not actually have anything against");
        System.out.println("younger sisters (It's cap I do lol). infact I am one. this game is just farce.");
        System.out.println("If you like it, great! If you don't, then yes you are the problem");
        System.out.println("JK, Jk NOT heh.");
    }
    }

    public static void main(String[] args) {
        GameIntroduction gameIntro = new GameIntroduction();
        gameIntro.intro("INTRO.txt");
    }
}