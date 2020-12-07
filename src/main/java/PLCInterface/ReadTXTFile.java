package PLCInterface;

import java.io.File;
import java.util.Scanner;
import java.util.StringTokenizer;

public interface ReadTXTFile {
    default void readTXTFile(String filename) {
        try {
            File file = new File(filename);

            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();

                String[] result = data.split(",");
                for (int x=0; x<result.length; x++)
                    System.out.println(result[x]);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
