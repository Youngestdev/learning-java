/**
 * StringBuffer
 * Learning about Buffers and the {@code} .appendCodePoint() method.
 */
import java.lang.*;

public class StringBufferExample {
    public static void main(String[] args) {
        // Create a new string, name of Buffer type so I can append buffers to it
        StringBuffer name = new StringBuffer("Abdulazeez Abdulazeez ");
        System.out.println("String Buffer of my name " +name);
        // Supposing I need to add my middle name as an abbr.
        // I'll append it witht the .appendCodePoint() method.
        name.appendCodePoint(65);
        System.out.println("My full name after now: " +name);
    }
}