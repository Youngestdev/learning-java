/**
 * CompFile
 * Compares two files.
 * java CompFile first second
 */

import java.io.*;

public class CompFile {
    public static void main(String[] args) throws IOException {
        int i = 0, j = 0;        
        // Making sure both args have been passed.
        if (args.length != 2) {
            System.out.println("Usage: CompFile first second");
            return;
        }
        // Compare the files.
        try (FileInputStream first = new FileInputStream(args[0]);
             FileInputStream second = new FileInputStream(args[1])
        ){
            do {
                i = first.read();
                j = second.read();
                if ( i != j ) break;
            } while (i != -1 && j != -1);
            if ( i != j ) 
                System.out.println("Files differ. ");
            else
                System.out.println("Files are the same. ");
        } catch (IOException e) {
            System.out.println("I/O Error" +e);
        }
    }
}