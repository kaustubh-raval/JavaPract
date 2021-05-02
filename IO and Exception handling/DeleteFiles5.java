import java.io.*;

class DeleteFiles5
{
  public static void main(String[] args) {
		 File folder = new File("C:/abc");
		 for (File file : folder.listFiles())
		 {
        String name = file.getName();
		   if (name.startsWith("a") || name.startsWith("A"))
		   {
			   file.delete();
		   }
		 }
	}
}
