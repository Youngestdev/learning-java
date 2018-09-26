import javax.imageio.stream.FileCacheImageOutputStream;

/**
 * FileWrite
 */

import java.io.*;

class FileWrite {

    public static void main(String[] args) {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter text ('stop' to quit). ");
        // Using the try-with-resources.
        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.println(": ");
                str = br.readLine();

                if (str.compareTo("stop") == 0)
                    break;
                str = str + "\r\n";
                fw.write(str);
            } while (str.compareTo("stop") != 0);
        } catch (IOException e) {
            System.out.println("I/O Error; " +e);
        }
    }
}