@FunctionalInterface
interface Comp
{
    boolean compareInt(int a, int b);
}

public class FunInterface2 {
    public static void main(String[] args)
    {
        int a = 1, b = 2;

        Comp c = (int x, int y) -> x < y;

        boolean ans = c.compareInt(a,b);

        System.out.println("Result: " + ans);
    }
}
