import java.util.*;

public class MinMax4 {
    public static void main(String[] args)
    {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};

        IntSummaryStatistics s = Arrays.stream(arr).summaryStatistics();
        System.out.println("min: " + s.getMin() + "max: " + s.getMax());


        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int a : arr)
        {
            if(min > a)
                min = a;
            if(max < a)
                max = a;
        }

        System.out.println("min: " + min + "max: " + max);
    }
}
