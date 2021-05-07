import java.io.File;
import java.util.*;

public class FileSort5 {
    public static void main(String[] args)
    {
        String dir = "d:/project";
        File folder = new File(dir);
        List<File> allFiles = new ArrayList<File>();

        Queue<File> q = new LinkedList<>();
        q.add(folder);
        
        while(!q.isEmpty())
        {
            File temp = q.poll();

            if(temp.isFile())
            {
                allFiles.add(temp);
            }
            else if(temp.isDirectory())
            {
                q.add(temp);
            }
        }
        
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();

        switch (i)
        {
            case 1:
                sortByName(allFiles);
                break;
            case 2:
                sortByDate(allFiles);
                break;
            case 3:
                sortByASC(allFiles);
                break;
            case 4:
                sortByDesc(allFiles);
                break;
        }


    }

    private static void sortByDesc(List<File> allFiles) {
        Collections.sort(allFiles, (a,b) -> (b.getName().split("\\.")[1]).compareTo(a.getName().split("\\.")[1]));
        System.out.println(allFiles);
    }

    private static void sortByASC(List<File> allFiles) {
        Collections.sort(allFiles, (a,b) -> (a.getName().split("\\.")[1]).compareTo(b.getName().split("\\.")[1]));
        System.out.println(allFiles);
    }

    private static void sortByDate(List<File> allFiles) {
        Collections.sort(allFiles, (a,b) -> (getDate(a)).compareTo(getDate(b)));
        System.out.println(allFiles);
    }

    private static void sortByName(List<File> allFiles) {

        Collections.sort(allFiles, (a,b) -> (a.getName()).compareTo(b.getName()));
        System.out.println(allFiles);
    }

    private static String getDate(File a)
    {
        //code to get the date 
        return "";
    }
}
