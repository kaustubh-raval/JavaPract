import java.lang.*;

public class GenMerge6<T extends Comparable<T>> {

    static <T extends Comparable<T>> void mergesort (T[] a, int i, int j) {
	if (j - i < 1) return;
	int mid = i + (j - i) /2;
	mergesort(a, i, mid);
	mergesort(a, mid+1, j);
	merge(a, i, mid, j);
    }

    static <T extends Comparable<T>> void merge(T[] a, int p, int mid, int q) {

	Object[] tmp = new Object[q-p+1]; 
	int i = p;
	int j = mid+1;
	int k = 0;

	while (i <= mid && j <= q) {
	    if (a[i].compareTo(a[j])<=0)
		tmp[k] = a[i++];
	    else
		tmp[k] = a[j++];
	    k++;
	}
    
	if (i <= mid && j > q) {
	    while (i <= mid) 
		tmp[k++] = a[i++];
	} else {
	    while (j <= q)
		tmp[k++] = a[j++];
	}
	for (k = 0; k < tmp.length; k++) {
	    a[k+p] = (T)(tmp[k]); 
	}
    }    
    
    public static void main(String[] args) {
        Integer[] a = {1,10,2,4,5};
        GenMerge6.mergesort(a, 0, a.length-1);
	
        for (int i = 0; i < a.length; i++)
            System.out.println(a[i].toString());
    }
}