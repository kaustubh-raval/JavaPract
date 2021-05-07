import java.util.regex.*;

public class RegFind2 {
    
    public static void main(String[] args)
    {
        String stringToSearch = "Four score and seven years ago our fathers ...";
        
        Pattern p = Pattern.compile("score");
        Matcher m = p.matcher(stringToSearch);

        System.out.println(m.find());

    
    }
}
