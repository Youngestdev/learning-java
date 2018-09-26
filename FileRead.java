
/**
 * FileRead
 */

import java.io.*;

public class FileRead {

    public static void main(String[] args) {
        String x;
        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((x = br.readLine()) != null) {
                System.out.println(x);
            }
        } catch (IOException e) {
            System.out.println("I/O Error: " + e);
        }

    }
}