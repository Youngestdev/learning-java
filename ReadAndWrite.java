/**
 * ReadAmdWrite
 * Demonstrate the reading and writing of file in Java
 * I'm lazy to write the .close() blocks everytime so I built this following
 * the try-with-resources style.
 */
import java.io.*;

class ReadAndWrite {
    public static void main(String[] args) throws IOException{
        int i;

        if (args.length != 2) {
            System.out.println("Usage: Read from to");
        }
        try (FileInputStream fin = new FileInputStream(args[0]);
        FileOutputStream fout = new FileOutputStream(args[1]);
        ) {

            do {
                i = fin.read();
                if (i != -1) fout.write(i);
            } while (i != -1);
        } catch (IOException e) {
            System.out.println("I/O Error " +e);
        }
    }
}