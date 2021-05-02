public class CustomException6
{
  static void checkNum(int number) throws InvalidNumberException{
     if(number < 10)
      throw new InvalidNumberException("number is not valid");
     else
      System.out.println("number is accepted");
   }

   public static void main(String args[]){
      try
      {
        checkNum(1);
      }
      catch(Exception m)
      {
        System.out.println("Exception occured: "+m);
      }
  }
}

class InvalidNumberException extends Exception
{
  InvalidNumberException(String str)
  {
    super(str);
  }
}
