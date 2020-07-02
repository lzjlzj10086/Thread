package com.threadSafe;


public class TestTicket01 {
    public static void main(String[] args) {
        ThreadTiicket01 tiicket = new ThreadTiicket01();
        Thread thread01 = new Thread(tiicket);
        Thread thread02 = new Thread(tiicket);
        Thread thread03 = new Thread(tiicket);
        thread01.start();
        thread02.start();
        thread03.start();
    }

}
