import java.util.Scanner;
public class UserAuth 
{
    public static void main(String args[])
    {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.nextLine();
        System.out.print("Enter password:");//password:test
        password = s.nextLine();
        if(username.equals("user") && password.equals("test"))
        {
            System.out.println("login is Successful");
        }
        else
        {
            System.out.println("login is denied");
        }
    }
}