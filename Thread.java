import java.lang.*;

class InitialThread implements Runnable {
    public void run() {
        Systen.lout.println("Heyoo.. This thread lesson for me ain't easy.");
    }
    public static void main(String[] args) {
        (new Thread(new InitialThread())).start();
    }
}

class ThreadExample extends Thread {
    public void run() {
        System.out.println("Haha ! Learning how threads work from the official docs.");
    }
    public static void main(String[] args) {
        (new ThreadExample()).start();
    }
}