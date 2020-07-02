package com.thread01;

import org.junit.Test;

/**
 * java：抢占式线程：根据用优先级执行，优先执行优先级高的，同一优先级，随机选一个执行
 * 多线程创建方法一：1.创建thread的子类。2.重写run（）方法。3.创建子类对象。4.调用start方法，开启线程。
 * 获取线程名称：1.getName（）2.静态方法currentThread（）获取当前执行的线程，然后在调用getName方法获取线程名称。
 * 设置线程名称：1.Thread类中setName（name）方法. 2.调用带参数的构造方法，然后调用父类构造方法设置线程名称
 * 静态方法sleep(long):是当前正在执行的线程以指定的毫秒数暂停，毫秒数结束好继续执行
 *
 * 多线程创建方法二：1.实现Runnable接口，重新run（）方法。 2.创建Runnable实现类对象 3.创建Thread对象，在构造传Runnable对象 4.调用Thread的start方法·
 */
public class MyMain {

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        for(int i= 0;i<10;i++){
            System.out.println("main线程"+i);
        }
        System.out.println(Thread.currentThread());
    }

    @Test
    public void test(){
        MyThread myThread = new MyThread();
        myThread.setName("myThread");
        myThread.start();
        new MyThread("king线程").start();
    }
    @Test
    public void testRunnable(){
        RunnableImpl runnable = new RunnableImpl();
        Thread thread = new Thread(runnable);
        thread.start();
        for(int i= 0;i<10;i++){
            System.out.println("main线程"+i);
        }
    }
}
