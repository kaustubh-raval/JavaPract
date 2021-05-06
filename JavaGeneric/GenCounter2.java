public class GenCounter2 {

	public static void main(String[] args) {

		Integer  numberCheck = 3;
		CheckNumber<Integer> var= new CheckNumber<Integer>(numberCheck);
		System.out.println("odd number:"+var.oddNumber());
	}
}

class CheckNumber<T>
{
	T vals;

	public CheckNumber(T i) {
		
		vals = i;
	}
	
	public String oddNumber() {
		
		if((Integer) vals%2 != 0)	return "The number is ODD";
		
		return "The number is even";		
	}
}