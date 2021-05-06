import java.util.*;
class LongestSubstring {
    public static void main(String[] args)
    {
        String str = "abcbbcc";
        int n = str.length();
        int index = 0;
        int current = 0;
        int max = 0;
        int s = 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put(str.charAt(0), 0);

        int i;
        for (i = 1; i < n; i++)
        {
            char ch = str.charAt(i);

            if (!map.containsKey(ch)) map.put(ch, i);
            else if(map.get(ch) >= index)
            {
                current = i - index;
                if (max < current)
                {
                    max = current;
                    s = index;
                }
                index = map.get(ch) + 1;
            }
            map.replace(ch, i);
        }
        
        if (max < i - index)
        {
            max = i - index;
            s = index;
        }
    
        System.out.println(str.substring(s, s + max));
    }
}
