import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class IchigoLand
 { //method for ichigo land
    public static void ichigo() 
    {
        Scanner log = new Scanner(System.in);
        System.out.println("Damn you end up in this red dessert which looks like something");
        System.out.println("out of the malificent movie or something. Then you hear a fluttering");
        System.out.println("noise coming from somewhwere behind you. Gues what? it is not even in the"); 
        System.out.println("distance but at the nape of your neck sending chills down your spine skeleton"); 
        System.out.println("face two times you are so afraid you do not know what to even do");
        System.out.println("Please type 'go' to proceed or 'meh' to turn back");
        String m = log.nextLine();
        if (m.equals("go")) {
            System.out.println("Ok fair enough. You are this brave to proceed I am proud of you *whispers: not lol*");
        } else if (m.equals("meh")) {
            System.out.println("I do not admire your lack of braveness but well it cannot be helped");
            System.out.println("Oh and by the way you are still proceeding lol");
        }
    } 

    public static void reunionandavanti() 
    {
        Scanner log = new Scanner(System.in);
        System.out.println("You proceed and on your way, a floating man named wise avanti approaches you and asks how and who you are!");
        System.out.println("you panick at first but he assures you he comes in peace and is just lonely and needs a friend.");
        System.out.println("Bear in mind you shrug your shoulders and just proceed Hmm you feel that fluterring sound again but");
        System.out.println("this time naah you are not ready to play with life! You immediately turn back and it is");
        System.out.println("not in the direction anymore but in the direction you turned away from and you turn again and the same");
        System.out.println("thing happens You figure the sound in coming from your backpack!!!");
        System.out.println("Tap any key to Fling your bag");

        String Fling = log.nextLine();

        System.out.println("You fling your bag and you hear an ouchhhh and you recognised that voice!");
        System.out.println("that was it! you passed out on the red sand that smells like literal strawberry");
        System.out.println("You wake up to wise avanti and uma screaming your name and saying please don't leave us");
        System.out.println("Well figures! it was uman in the bag");
        System.out.println("Type Continue to proceed with this wonderful game");

        String Continue = log.nextLine();

        if (Continue.equals("Continue"))
        {
            System.err.println("You have good attention to detail");
        }
        else
        {
            System.out.println("Your attention to detail is not good mehn ");
        }
    }

        public static void ichidokugu()
        {
             try
        {
            File f2= new File("baby.txt");
            Scanner obj=new Scanner(f2);
            while(obj.hasNextLine())
            {
                String data=obj.nextLine();
                System.out.println(data);
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("sorry an error has occured");
            e.printStackTrace();
        }
        Scanner log=new Scanner(System.in);
        System.out.println("You proceed on your pointless journey with uman taging along anyways");
        System.out.println("behind you and humming the pointless song");
        System.out.println("You see a mirage of something weird approaching from the distance");
        System.out.println("This creature has a really weird and ominous presence");
        System.out.println("What by chance will you do huh?");
        System.out.println("1: You pick uman and hide behind the snow bush");
        System.out.println("2: You push uman towards the danger and abscond");
        System.out.println("3: You just stand there and do nothing");
    
        int cha=log.nextInt();

        switch (cha)
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
        public static void indigo()
        {
         Scanner log=new Scanner (System.in);
        System.out.println("As you proceed on your journey in ichigo land,");
        System.out.println("wise avanti keeps staring deep into your mind aND i am surprised you are so unbothered");
        System.out.println("Your sister has butterflies for hair, your best friend is a half dog half human and your 'friend'");
        System.out.println("floats and it isn't suspicious no one notices him but you??");
        System.out.println("Tell me the truth are you comfortable?: yes or no");

        String sus= log.nextLine();

        if(sus.equals("yes"))
        {
            System.out.println("Don't worry I won't judge you * wink wink hahah");
        }
        else if(sus.equals("no"))
        {
            System.out.println("It's okay to seek for help if you need some: 111 is a helpline");
        }
        else
        {
            System.out.println("Sorry invalid input young padawan");
        }
        System.out.println("anyways you procceed on your journey and you hear a commotion");
        System.out.println("Do you want to scan your surrounding?");
        System.out.println("Choose 1 for yes");
        System.out.println("Choose 2 for no");
        
        int scan=log.nextInt();

        switch (scan)
        {
            case 1: 
            System.out.println("You use wise avanti's senses to scan the surrounding");
            System.out.println("Oh it's not anything dangerous to worry about says wise avanti");
            System.out.println("After walking for another 15 minutes, you hear the commotion again and you hear dokugu");
            System.out.println("screaming. you look around frantically and notice both dokugu and uman are gone");
            System.out.println("You ask wise avanti where they are an he shrugs and says a purple troll took them");
            System.out.print("You are too baffled to speak");
            System.out.println("What do you do?");
            System.out.println("type a to find them or b to abandon them");

            String w= log.nextLine();

            if(w.equals("a"))
            {
                System.out.println("You go searching and you find them wrapped up and bonded");
                System.out.println("Indigo the troll asks for a ransom. What will you give him");

                System.out.println("Choose 1 for flowers");
                System.out.println("Choose 2 for 1000 mysteria coins");
                System.out.println("Choose 3 to get the old book laying by the strawberry pond");

                int p=log.nextInt();
                switch (p)
                {
                    case 1:
                    System.out.println("You pick some purple mysteria flowers and give him");
                    System.out.println("He smiles at you and pats your shoulder");
                    System.out.println("You smile back and then he proceeds to beat the living daylight out of");
                    System.out.println("You and all your team member except wise avanti");
                    System.out.println("You seem to see something like a smirl on wise avantis face but you cant");
                    System.out.println("seem to focus due to the pain");
                    break;
                    case 2:
                    System.out.println("You sell your valuable figurine and give him the money");
                    System.out.println("He smiles at you and pats your shoulder");
                    System.out.println("You smile back and then he proceeds to beat the living daylight out of");
                    System.out.println("You and all your team member except wise avanti");
                    System.out.println("You seem to see something like a smirk on wise avantis face but you cant");
                    System.out.println("seem to focus due to the pain");
                    break;
                    case 3:
                    System.out.println("He scrutinizes you and gives you a dirty look");
                    System.out.println("He proceeds to release your team mates");
                    System.out.println("You request him to keep uman if he wants but he screams get out before");
                    System.out.println("I attack");
                }
            }
            else if (w.equals("no"))
            {
                System.out.println("You abandon them and keep walking for hours");
                System.out.println("You turn back and see an angry looking uman and dokugu and you say oh hey");
                System.out.println("They don't even respond to you");
                System.out.println("After some hours they had forgotten your betrayal and dokugu");
                System.out.println("Tells you the troll actually realeased them because he could not stand the annoying girl");
                System.out.println("Apparently the troll was so annoyed he turned red courtesy of uman");
            }
            else
            {
                System.out.println("Error mate error");
            }
        }
        }
        
        

    }
    
