package com.threadStatus;

public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj = new Object();
        new Thread(){
            @Override
            public void run() {
                System.out.println("等待之前----");
                synchronized (obj){
                    try {
                        obj.wait();
                        System.out.println("等待之后------");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                try {
                    sleep(3000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("唤醒之前------");
                    obj.notify();
                    System.out.println("唤醒之后-----");
                }
            }
        }.start();
    }
}
