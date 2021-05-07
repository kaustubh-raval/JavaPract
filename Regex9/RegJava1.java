public class RegJava1
{
    public static void main(String[] args)
    {
        String pwd = "aaZZa44@"; 
        
        String pattern = "((?=.*[a-z])(?=.*d)(?!\3)(?=.*[@#$%])(?=.*[A-Z]).{8,15})";

        System.out.println(pwd.matches(pattern));
    }
}