import java.util.function.DoubleBinaryOperator;

public class Wrapper1 {
    public static void main(String[] args)
    {
        Integer i = 55;
        Double d = 1.11;
        Character c = 'A';

        System.out.println(i.intValue());
        System.out.println(d.doubleValue());
        System.out.println(c.charValue());

        String str = i.toString();
        System.out.println("String: " + str);

        String numString = "123";
        Integer numInt = Integer.parseInt(numString);

        System.out.println("Integer value: " + numInt);
        System.out.println("Different Values: " + Integer.compare(1, 5));
        System.out.println("Same values: " + Integer.compare(1, 1));
        
        String intToString = Integer.toString(123); 
        System.out.println("Integer to String: " + intToString);

    }
}
