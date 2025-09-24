package com.example;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
          * @throws Exception 
          */
         public static void main(String[] args) throws Exception {
        System.out.println("Hello World!");
        int x=10;
        System.out.println(Thread.currentThread().getName());
        MioTread t1 =new MioTread(198);
        MioTread t2 =new MioTread(195);
        t1.start();
        t2.start();

        t1.join();
        t2.join();
        System.err.println("finito");
    }
}
