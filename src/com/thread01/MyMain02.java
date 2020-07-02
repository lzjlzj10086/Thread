package com.thread01;

public class MyMain02 {
    public static void main(String[] args) {
        //线程类
        new Thread(){
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println(currentThread().getName()+":"+i);
                }
            }
        }.start();
        //接口实现
        Runnable runnable = new RunnableImpl(){
            @Override
            public void run() {
                for (int i=0;i<5;i++){
                    System.out.println(Thread.currentThread().getName()+":"+i);
                }
            }
        };
        Thread thread = new Thread(runnable);
        thread.start();
    }
}
