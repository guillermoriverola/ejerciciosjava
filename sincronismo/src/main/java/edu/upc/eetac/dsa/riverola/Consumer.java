package edu.upc.eetac.dsa.riverola;

/**
 * Created by Guillermo on 02/10/2015.
 */
public class Consumer implements Runnable {
    private Buffer buffer = null;

    public Consumer(Buffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        StringBuilder sb = new StringBuilder();
        char c;
        while ((c = buffer.get()) != '\n') {
            // Uncomment to log what is reading the thread
            // System.out.println(Thread.currentThread().getName() + " reads " + c);
            sb.append(c);
        }
        System.out.println(sb);
    }
}
