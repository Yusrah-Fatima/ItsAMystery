import java.util.*;
import java.io.*;
public class YukiLand {
    //method for uman reunion
    public static void reunion() {
        Scanner log = new Scanner(System.in);

        System.out.println("Welcome to Yuki Land where the stars are red and the sun is blue.");
        System.out.println("This mystical looking place is actually a desert,");
        System.out.println("but instead of sand, there is snow and the snow is actually hot.");
        System.out.println("Ngl, I also find it very weird but well, it can't be helped.");
        System.out.println("As you venture through Yuki Land, you suddenly feel those flutters.");
        System.out.println("And no, it's not hunger, trust me. It sounds too familiar.");
        System.out.println("Well yeah, it's actually uman. Now the journey ends here.");
        String actzero= log.nextLine();
        System.out.println("Just kidding, just kidding.");
        System.out.println("What will you do?");
        String act = log.nextLine();
        System.out.println("1. PUSH HER ASIDE");
        System.out.println("2. Ignore her and continue exploring.");
        int choice = log.nextInt();
        log.nextLine(); // consume newline

        switch (choice) 
        {
            case 1:
                System.out.println("You push her aside and ask her, 'WHAT ARE YOU DOING HERE, YOU FOOL!'");
                break;
            case 2:
                System.out.println("You just ignore her and proceed on your journey ahead.");
                break;
            default:
                System.out.println("Invalid choice. You stand there, unsure of what to do.");
                break;
        }
        log.close(); // Close the scanner
    }
    //method for character meeting

    public static void dokugu() 
    {
        Scanner log= new Scanner(System.in);

        System.out.println("You proceed on your pointless journey with uman taging along anyways");
        System.out.println("behind you and humming the pointless song");
        System.out.println("You see a mirage of something weird approaching from the distance");
        System.out.println("This creature has a really weird and ominous presence");
        System.out.println("What by chance will you do huh?");
        System.out.println("1: You pick uman and hide behind the snow bush");
        System.out.println("2: You push uman towards the danger and abscond");
        System.out.println("3: You just stand there and do nothing");
    
        int c=log.nextInt();

        switch (c)
        {
            case 1: 
            System.out.println("You hide behind the warm snow bush and as the figure comes closer");
            System.out.println("you realise it's dokugu your best best friend LOL. you hug him");
            break;
            case 2:
            System.out.println("You push uman and wait to hear screams and cries of agony");
            System.out.println("When you don't hear screams you peek and you see uman");
            System.out.println("playing with your best friend dokugu");
            System.out.println("You are actually dissapointed.");
            System.out.println("But then you are happy to see your best friend so meh you hug him");
            break;
            case 3:
            System.out.println("You just stand there feeling brave with no weapon i guess --");
            System.out.println("However, the figure comes closer and oh! it's just dokugu you hug him");
            break;
            default:
            System.out.println("Cmon mate you had to choose");
            break;
        }
        }
    //method for mimii fight
    public static void mimii()
    {
      Scanner log= new Scanner(System.in);
      System.out.println("You continue on your journey of 3 and you are having a good time with doguku");
      System.out.println("You are passing by and you see an anger extinguisher");
      System.out.println("Dokugu picks it up as you might need it later");
      System.out.println("You hear screams and arguements and you run to where the commotion is");
      System.out.println("You see mimii the sassy lady screaming at a frog who looks as unbothered as ever");
      System.out.println("Mimii notices your troop and she starts heading towards you while bringing");
      System.out.println("A hammer");
      System.out.println("What do you do: This is a trick by the way");
      System.out.println("pick: 1 or 2");
      int f =log.nextInt();
      switch (f)
      {
       case 1:
       System.out.println("good choice btw:You snatch the anger extinguisher out of dokugu's");
       System.out.println("Pocket and spray the angry lady");
       break;
       case 2:
       System.out.println("Bad choice by the way. You try to use uman's butterfly hair to counterattack");
       System.out.println("But uman is at the far end playing with the frog");
       System.out.println("Let's just say you and dokugu now have a permanent dent in your skull");
       break;
       default:
       System.out.println("You obviously had to pick");
       break;
       
      }
      log.close();
    }
}
