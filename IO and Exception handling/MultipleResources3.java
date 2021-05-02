import java.io.*;
import java.util.Scanner;
class MultipleResources3
{
  public static void main(String[] args)
  {
    try (Scanner scanner = new Scanner(new File("file.txt"));
    PrintWriter writer = new PrintWriter(new File("output.txt")))
    {
      while (scanner.hasNext())
      {
	       writer.print(scanner.nextLine());
      }
    }
    catch(Exception e)
    {
      e.printStackTrace();
    }
  }
}
