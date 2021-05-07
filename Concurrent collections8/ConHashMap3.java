import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

public class ConHashMap3 {
    public static void main(String[] args)
    {
        ConcurrentHashMap<String, List<Integer>> map = new ConcurrentHashMap<>();

        Thread t1 = new Thread(new Runnable(){
        @Override
        public void run() { map.put("abc", new ArrayList(Arrays.asList(new int[]{1,2})));}
        });

        Thread t2 = new Thread(new Runnable(){
            @Override
            public void run() { map.put("abac", new ArrayList(Arrays.asList(new int[]{1,3,2})));}
            });
        
        Thread t3 = new Thread(new Runnable(){
            @Override
            public void run() { map.put("aadfbc", new ArrayList(Arrays.asList(new int[]{1,2,4})));}
            });
        
        Thread t4 = new Thread(new Runnable(){
            @Override
            public void run() { map.get("aasgbc");}
            });
        
        Thread t5 = new Thread(new Runnable(){
            @Override
            public void run() { map.get("abzshbc");}
            });
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }
}
