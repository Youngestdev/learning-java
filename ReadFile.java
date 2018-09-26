/**
 * ReadFile
 * Display file content example.
 * Just to see how the I/O system works.
 */

import java.io.*;

public class ReadFile {

    public static void main(String[] args) {
        int i;
        char j;
        FileInputStream fin;

        if (args.length != 1) {
            System.out.println("Usage: Reafile <filename>");
        }
        try {
            fin = new FileInputStream(args[0]);
        } catch(FileNotFoundException exc) {
            System.out.println("File Not Found");
            return;
        }
        try {
            // Read file till the EOF ( End O File) is reached.
            do {
                i = fin.read();
                if (i != -1 ) {
                    j = (char) i; 
                }
            } while (i != -1);
        } catch (IOException exc) {
            //TODO: handle exception for IO error.
            System.out.println("Unable to load file");
        }
        try {
            fin.close();
        } catch (IOException exc) {
            //TODO: handle exception
            System.out.println("Unable to close file");
        }
    }
}