import java.util.*;
import java.util.stream.Collectors;

class Names
{
    String fname;
    String lname;
    public Names(String f, String l)
    {
        this.fname = f;
        this.lname = l;
    }
}

public class FilterName3 {
    public static void main()
    {
        List<Names> list = new ArrayList<>();
        list.add(new Names("fname1", "lname2"));
        list.add(new Names("fname2", "lname2"));
        list.add(new Names("fname3", "lname2"));
        list.add(new Names("fname4", "lname4"));

        Set<String> set = new HashSet<>();
		Set<Names> ans = list.stream().filter(e -> e.lname.equals("Williams") && set.add(e.fname))
				.sorted((e1,e2) -> e1.fname.compareTo(e2.fname))
				.collect(Collectors.toSet());

        System.out.println(ans);
    }
}
