import java.util.*;
public class GameLogin {
    public static String userName = null;
    public static String userPassword = null;
    //method for registration
    public void registerUser()
    {
        Scanner log=new Scanner(System.in);

        System.out.println("Create your user name");
        userName = log.nextLine();
     
        System.out.println("Create your password");
        userPassword = log.nextLine();
        
        System.out.println("Registration successful! You can now log in.");
    }
    //method for login
    public boolean loginUser()
    {
        Scanner log=new Scanner(System.in);

        boolean success=false;

        if (userName == null || userPassword == null) {
            System.out.println("No registered user. Please register first.");
        }

        System.out.println("Input your user name");
        String userName = log.nextLine();
        
        System.out.println("Input your password");
        String userPassword = log.nextLine();
        
        if(userName.equals(userName) && userPassword.equals(userPassword)) {
            System.out.println("Welcome back young padawan");
            success=true;
        } else {
            System.out.println("Incorrect username or password.");
        }

        return success;
  }

    
}