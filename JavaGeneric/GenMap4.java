import java.util.*;

class MapG<T>
{
    private List<List<T>> list;

    public MapG()
    {
        list = new ArrayList<>();
    }

    public void put(T key, T val)
    {
        boolean flag = true;

        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).get(0).equals(key))
            {
                flag = false;
                list.get(i).set(1, val);
                break;
            }
        }

        if(flag)
        {
            List<T> subList = new ArrayList<>();
            subList.add(key);
            subList.add(val);
            list.add(subList);
        }
    }

    public T get(T key)
    {
        for(int i = 0; i < list.size(); i++)
        {
            if(list.get(i).get(0).equals(key))
            {
                return list.get(i).get(1);
            }
        }
        return (T)" ";
    }

    public boolean isEmpty()
    {
        return list.size() == 0;
    }

    public Object[] keys()
    {
        Object[] res = new Object[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            res[i] = list.get(i).get(0);
        }
        return res;
    }

    public Object[] vals()
    {
        Object[] res = new Object[list.size()];

        for(int i = 0; i < list.size(); i++)
        {
            res[i] = list.get(i).get(1);
        }
        return res;
    }
}

public class GenMap4 {
    
    public static void main(String[] args)
    {
        MapG<Integer> map = new MapG<Integer>();
        map.put(1,1);
        map.put(2,4);
        map.put(3,10);
        map.get(1);
    }
}
