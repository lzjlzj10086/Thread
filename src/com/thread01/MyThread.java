package com.thread01;

public class MyThread extends Thread {

    public MyThread() {
    }

    public MyThread(String name) {
        super(name);
    }

    /**
     * 设置线程任务在run方法
     */
    @Override
    public void run() {
        System.out.println(getName());
        for(int i=0;i<10;i++){
            System.out.println("run"+i);
        }
    }
}
