import java.util.*;
import java.io.*;
import java.io.FileNotFoundException;
public class Endart 
{
    public static final String R = "\u001B[0m";
    public static final String RED = "\u001B[41m";
    //method for game Ending and asciiart
    public static void end(String fileName)
    {
        Scanner log=new Scanner(System.in);
        try 
        {
            File myfile = new File("amusement park.txt");
            Scanner scanner = new Scanner(myfile);
            while (scanner.hasNextLine())
            {
                String data = scanner.nextLine();
                System.out.println(RED + data + R);
            }
            scanner.close();
        } catch (FileNotFoundException e)
        {
            System.out.println("Sorry, an error has occurred.");
            e.printStackTrace();
        }
        System.out.println("Congratulations on getting to the amusement park with or without getting beaten up. This just shows you");
        System.out.println("Wether you get beaten up or not you will always get to your destination if you dont give up");
        System.out.println("Even though i forced some options upon you lol");
    }

    public static void main(String[] args) {
        end("amusement park.txt");
    }
}
