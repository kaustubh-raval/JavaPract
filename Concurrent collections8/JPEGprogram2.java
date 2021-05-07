import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import java.awt.image.*;

public class JPEGprogram2 {
    public static void main(String[] args) throws IOException
    {
        File folder = new File("D:/Project/");
		File listOfFiles[] = folder.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
					return file.getName().endsWith(".jpeg");
			}
		});

		Queue<String> fileNames = new LinkedList<>();

		for (int i = 0; i < listOfFiles.length; i++) {
				fileNames.add(listOfFiles[i].getName());
		}

        for (String fileName : fileNames) {
			try {				
				File imagePath = new File("D:/Project/" + fileName);
				double imageSize = (double) imagePath.length() / (1024 * 1024);
                

				if (imageSize > 1) {					
					BufferedImage image = ImageIO.read(imagePath);
					System.out.println("Image Contents: " + image);
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
    }
}
