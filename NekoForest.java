import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;


public class NekoForest
{ 
      public static final String R = "\u001B[0m";
      public static final String Y = "\u001B[43m";
    //method for neko land first arc and asciiart
      public static void Neko()
    {
        try
        {
            File f2= new File("neko.txt");
            Scanner obj=new Scanner(f2);
            while(obj.hasNextLine())
            {
                String data=obj.nextLine();
                System.out.println(data);
            }
            obj.close();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("sorry an error has occured");
            e.printStackTrace();
        }

        Scanner log= new Scanner(System.in);

        System.out.println("Psst hey You ");
        System.out.println("Good choice and welcome to nekoland ");
        System.out.println("What is that fluttering behind you though?");
        System.out.println("Then you turn and fling your bag and uman your little annoying");
        System.out.println("drops out and scream ouchhh");
        System.out.println("You scream and ask her what are you doing here then dokugu pops up from behind you are happy");
        System.out.println("She shrugs and says she followed you");
        System.out.println("Choose 1 to pull her cheeks or 2 to trip her");

        int mean=log.nextInt();

        switch (mean) 
        {
            case 1:
            int i=1;
            while (i<4)
            {
            System.out.println("You pulled her cheek hard"+i);
            i++;
            }
            {
                System.out.println("You pulled her cheeks 3 times");
                break;
            }
            case 2:
            int f=1;
            while (f<5)
            {
                System.out.println("You tripped her"+f);
                f++;
            }
            {
                System.out.println("You tripped her 4 times along the way");
            }
            default:
            {
              System.out.println("Too bad you are too nice");
                break;
                
            }
            // to close the scanner 
        }
    }   //method for mumuu cat
        public static void mumuu()
        {
            Scanner log =new Scanner(System.in);
            System.out.println("You are diving deep into the forest now");
            System.out.println("Pick some things along the way");
            System.out.println("1: Cookies");
            System.out.println("2: Big head potion");

            String c= log.nextLine();

            System.out.println("I know i stopped apbruptly but what is that yello huge thing approching?????");
            System.out.println("Tap enter");

            String cb= log.nextLine();
        
        try 
      {
        File myfile = new File("mumuucat.txt");
        Scanner scanner = new Scanner(myfile);
        while (scanner.hasNextLine()) 
        {
            String data = scanner.nextLine();
            System.out.println(Y + data + R);
            
        }
      } 
      catch (FileNotFoundException e) 
      {
        System.out.println("Sorry, an error has occurred.");
        e.printStackTrace();
      }
        System.out.println("It's coming closer at a fast pace quick what will you choose?");

        int ca = log.nextInt();

        System.out.println("GIVE ME FOOD OR ME EAT YOU says the huge angry yellow cat");

    switch (ca)
    {
        case 1:
            System.out.println("You entered 1");
            break;
        case 2:
            System.out.println("You entered 2");
            break;
        default:
            System.out.println("Sorry you have to choose");
            break;
    }
    if (ca == 1) 
    {
        System.out.println("Great choice! You know how your doctor says sweets are not good for you?");
        System.out.println("Well this proves them wrong lol");
        System.out.println("You give the cat your cookies and he lets you go happily");
    }
    if (ca == 2) 
    {
        System.out.println("Uhh really??? he is already a big cat hehe");
        System.out.println("anyways you have all been beaten up by ");
        System.out.println("mr mumuu who is a very hungry cat");
    }
    else
    {
        System.out.println("");
    }
    log.close();
}

        public static void main(String[] args) {
            Neko();
            NekoForest mumuu=new NekoForest();
            NekoForest.mumuu();
        }
    }
        
     
