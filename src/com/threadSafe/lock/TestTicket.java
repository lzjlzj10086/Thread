package com.threadSafe.lock;


public class TestTicket {
    public static void main(String[] args) {
        ThreadTiicket tiicket = new ThreadTiicket();
        Thread thread01 = new Thread(tiicket);
        Thread thread02 = new Thread(tiicket);
        Thread thread03 = new Thread(tiicket);
        thread01.start();
        thread02.start();
        thread03.start();
    }

}
