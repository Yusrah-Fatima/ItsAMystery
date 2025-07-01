import java.util.*;
public class Dobugu
{//method for concluding arc
  public static void lastarc()
  {
    Scanner sc= new Scanner(System.in);
    System.out.println("You have made it this far mate. with your battalion behind you");
    System.out.println("Yes Yes I know Uman is still annyoing and some of you have been beaten up");
    System.out.println("Anyways you are  all walking but you hear heavy giant footsteps");
    System.out.println("I hope its not! you say aggitated");
    System.out.println("Yes it is says uman nonchalantly ");
    System.out.println("You wonder how this fool is able to stay calm at a time like this!");
    System.out.println("Dobugu looks as pale as a sheet. afterall everyone fears his older bro");
    System.out.println("And his name issssss DOBUGU says an ominous voice outta nowhere");
    System.out.println("Its actually not out of nowhere its uman tch");
    System.out.println("Choose the correct answer to survive.");
    System.out.println("What is the name of the creator of this game");
    System.out.println("1: Fatimah");
    System.out.println("2: Fatima");
    System.out.println("3: Fatma");
    int correct= sc.nextInt();
    switch(correct)
    {
        case 1:
        System.out.println("LOOOOL nope you and your troop are");
        System.out.println("all battered and beaten up plus if you have");
        System.out.println("a dent from previously then you are obviously");
        System.out.println("uglier now");
        break;
        case 2:
        System.out.println("hehe congratulations you smart person");
        System.out.println("You get to a free pass to the amusement");
        System.out.println("Park with your troop 'that was the purpose of your journey btw'");
        break;
        case 3:
        System.out.println("LOOOOL nope you and your troop are");
        System.out.println("all battered and beaten up plus if you have");
        System.out.println("a dent from previously then you are obviously");
        System.out.println("uglier now whats even worst in an amusement park");
        System.out.println("You have to pay for your pass by the way");
        break;
        default:
        System.out.println("Invalid choice mate");
        break;
    }
  }
  public static void main(String[] args) {
    Dobugu lastarc= new Dobugu();
    Dobugu.lastarc();
  }
}