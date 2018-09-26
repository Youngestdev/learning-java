/**
 * PrintWriter
 */

import java.io.*; 

public class PrintWriter {

    public static void main(String[] args) {
        PrintWriter pw = new PrintWriter(System.out, true);
        int i = 15;
        double d = 2.5;
        String name = "Abdul";

        pw.println("Using a PrintWriter.");
        pw.println(i);
        pw.println(d);
        pw.println(i + " + " + d + " is " + (i+d));
    }
}