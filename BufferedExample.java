/**
 * BufferedExample
 * Showcasing how the BufferedReader works.
 */

import java.io.*;

// Read characters from the console.
class ReadChar {
    public static void main(String[] args) throws IOException {
        // character datatype
        char c;
        // Declare the buffered stream reader, br.
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter any character... period to quit");
        do {
            c = (char) br.read();
            System.out.println(c);
        } while (c != '.');
    }
}

// Read strings from the console.
class ReadString {
    public static void main(String[] args) throws IOException {
        String str;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter strings from the console");
        System.out.println("Enter 'quit' to quit");

        do {
            // We used @{code} .readLine() so we can read Strings.
            str = br.readLine();
            System.out.println(str);
        } while (!str.equals("quit"));

    }
}