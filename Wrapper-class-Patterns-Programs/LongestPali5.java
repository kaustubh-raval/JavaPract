public class LongestPali5 {
    public static void main(String[] args)
    {
        String s = "abcbab";
        int start = 0, end = 0;
        for(int i = 0; i < s.length(); i++)
        {
            int str1 = function(s, i, i);
            int str2 = function(s, i, i + 1);
            int len = Math.max(str1, str2);
            
            if(len > end - start)
            {
                start = i - (len-1) / 2;
                end = i + len / 2;
            }            
        }        
        System.out.println(s.substring(start, end + 1));
    }

    public static int function(String s, int left, int right)
    {
        while(left >= 0 && right< s.length() && s.charAt(left) == s.charAt(right))
        {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
