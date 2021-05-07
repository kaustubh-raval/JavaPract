import java.io.File;
import java.util.*;

public class FileCount6 {
    public static void main(String[] args)
    {
        String dir = "d:/project";

        File folder = new File(dir);
        File[] fileList = folder.listFiles();

        HashMap<String, Integer> map = new HashMap<>();

        for(File file : fileList)
        {
            String typeFile = file.getName().split("\\.")[1];

            map.put(typeFile, map.getOrDefault(typeFile, 0) + 1);
        }

        System.out.println("Different types of files: " + map.size());
        System.out.println();
        for(String str : map.keySet())
        {
            System.out.println(str);
        }

        for(String str1 : map.keySet())
        {
            System.out.println(map.get(str1) + str1 + "files");
        }
    }
}
