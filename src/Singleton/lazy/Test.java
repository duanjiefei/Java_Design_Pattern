package Singleton.lazy;

import Singleton.lazy.T;

public class Test {
    public static void main(String[] args) {
        Thread t1 = new Thread(new T());
        Thread t2 = new Thread(new T());
        Thread t3 = new Thread(new T());
        Thread t4 = new Thread(new T());
        Thread t5 = new Thread(new T());
        Thread t6 = new Thread(new T());
        Thread t7 = new Thread(new T());
        Thread t8 = new Thread(new T());
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
        t7.start();
        t8.start();
        System.out.println("main thread end");
    }
}
