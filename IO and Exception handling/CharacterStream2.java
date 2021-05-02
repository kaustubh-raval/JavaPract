import java.io.*;

class CharacterStream{
  public static void main(String[] args) throws IOException
    {
        // FileReader input = null;
        FileWriter output = new FileWriter("output.txt");
        String str = "";

        try {
            LineNumberReader line = new LineNumberReader(new InputStreamReader(new FileInputStream("file.txt"), "UTF-8"));

            while (((str = line.readLine()) != null) && line.getLineNumber() <= 2){
                output.write(str);
                output.write("\n");
            }
        }
        catch (FileNotFoundException e) {
            System.err.println("File not found");
        }
        finally{
          output.close();
        }
    }
}
