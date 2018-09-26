import java.io.*;
/**
* ReadBytes
* Learning About I/O and its operations.
* This class, reads from the console and prints it out.
*/

class ReadBytes {
    public static void main(String[] args) throws IOException {
        byte data[] = new byte[10];
        System.out.println("Enter some character. ");
        System.in.read(data);
        System.out.print("You entered: ");
        for (int i = 0; i < data.length; i++) {
            // This will print out the byte character just as defined in line 10.
            System.out.print("Byte data" + data[i]);
            // This will convert the byte to char so it displays what we typed.
            System.out.print((char) data[i]);
        }
    }
}

class WriteBytes {
    public static void main(String[] args) {
        int b;
        b = 'X';

        System.out.write(b);
        System.out.write('\n');

    }
}