class BinarySearch<T extends Comparable<T>>
{
    public BinarySearch()
    {

    }
    public int search(Object[] arr, T key)
    {
        int lo = 0;
        int hi = arr.length - 1;

        while(lo <= hi)
        {
            int mid = lo + (hi - lo/2);

            if(arr[mid].equals(key))
            {
                return mid;
            }
            else if(((T)arr[mid]).compareTo(key) < 0)
            {
                lo = mid + 1;
            }
            else
            {
                hi = mid - 1;
            }
        }

        return -1;
    }
}

public class GenBinary5 {
    public static void main(String[] args)
    {
        BinarySearch<Integer> b = new BinarySearch<Integer>();

        Object[] arr = {1,2,3,4,5,6,7};

        int search = b.search(arr, 5);
        System.out.println(search);
    }
}
