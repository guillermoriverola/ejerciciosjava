package edu.upc.eetac.dsa.riverola;

/**
 * Created by Guillermo on 02/10/2015.
 */
public class AppThreads {
    public static void main(String[] args) throws InterruptedException {
        ThreadClass threadClass = new ThreadClass("thread class");
        Thread thread = new Thread(new RunnableClass(), "runnable class");
        threadClass.start();
        thread.start();

        threadClass.join();
        thread.join();

        System.out.println("Se acabó.");
    }
}
