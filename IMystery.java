import java.util.*;

public class IMystery {
    public static void main(String[] args) {
        Scanner log=new Scanner(System.in);

        GameIntroduction gameIntro = new GameIntroduction();
        gameIntro.intro("INTRO.txt");

        GameLogin login=new GameLogin();

        Assist erry=new Assist();
        Assist.erry();

        System.out.println("1: User Registration");
        System.out.println("2: User login");

        int choice=log.nextInt();

        if (choice==1) {
            login.registerUser();
        }
        else if (choice==2) {
            login.loginUser();       
        }
        else {
            System.out.println("c'mon that is an invalid choice!");
        }


        if (login.loginUser()==true) {
            CharacterCreation character = new CharacterCreation();
            CharacterCreation.createCharacter();

            System.out.println("Choose a location you want to go.");
            System.out.println("1: Ichigo Land");
            System.out.println("2: Neko Forest");
            System.out.println("3: Yuki Land");

            choice=log.nextInt();

            if (choice==1)
            {
              System.out.println("You have chosen Ichigo land");

              IchigoLand ichigo=new IchigoLand();
              IchigoLand.ichigo();
              IchigoLand reunionandavanti=new IchigoLand();
              IchigoLand.reunionandavanti();
              Assist errytwo=new Assist();
              Assist.errytwo();
              IchigoLand ichidokugu= new IchigoLand();
              IchigoLand.ichidokugu();
              IchigoLand indigo= new IchigoLand();
              IchigoLand.indigo();
            }
            else if (choice==2)
            {
                System.out.println("You have chosen Neko forest");

                NekoForest Neko=new NekoForest();
                NekoForest.Neko();
                Assist errythree=new Assist();
                Assist.errythree();
                NekoForest mumuu= new NekoForest();
                NekoForest.mumuu();
            }
            else if (choice==3)
            {
                System.out.println("You have chosen Yuki Land");

                YukiLand reunion= new YukiLand();
                YukiLand.reunion();
                YukiLand dokugu= new YukiLand();
                YukiLand.dokugu();
                Assist erryfour=new Assist();
                Assist.erryfour();
                YukiLand mimii= new YukiLand();
                YukiLand.mimii();
            }

    Assist erryfive=new Assist();
    Assist.erryfive();
    Dobugu lastarc= new Dobugu();
    Dobugu.lastarc();
    Endart end= new Endart();
    Endart.end("amusement park.txt");
       
}
}
}