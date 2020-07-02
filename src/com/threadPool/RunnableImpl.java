package com.threadPool;

public class RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread()+"创建一个新的线程");
    }
}
