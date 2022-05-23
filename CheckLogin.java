import java.util.*;
class UsernameException extends Exception
{
public UsernameException(String msg)
{
super(msg);
}
}
class PasswordException extends Exception
{
public PasswordException(String msg)
{
super(msg);
}
}
public class CheckLogin
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
String username,password;
System.out.println("Enter the username: ");
username=s.nextLine();
System.out.println("Enter the password: ");
password=s.nextLine();
int length=username.length();
try
{
if(length<6)
throw new UsernameException("Username must be greater than 6 characters");
else if(!password.equals("hello"))
throw new PasswordException("Incorrect password\nTry correct password");

else
System.out.println("Login successfull !!!");
}
catch(UsernameException u)
{
u.printStackTrace();
}
catch(PasswordException p)
{
p.printStackTrace();
}
finally
{
System.out.println("The finally statement is excecuted");
}
}
}
		
				
