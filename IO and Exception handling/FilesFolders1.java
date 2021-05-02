import java.io.*;

public class FilesFolders {

    public static void main(String[] args) {
        
        String[] paths;

     
        File f = new File("C:/sts-4.9.0.RELEASE");
        
        paths = f.list();
        
        for (String path : paths) {
            
            System.out.println(path);
        }
    }
}
