package com.threadSafe;

/**
 * 解决线程安全问题
 *      方法一：同步代码块 synchronized (锁对象（同步锁）){
 *
 *                 }
 *             }
 *             把遇到出现可能出现线程安全问题的代码放在同步代码块中。
 */
public class ThreadTiicket implements Runnable{

    //共享数据
    private int ticket = 100;
    //创建锁对象
    Object object = new Object();

    @Override
    public void run() {
        while (true){
            synchronized (object){
                if (ticket>0){
                    System.out.println(Thread.currentThread().getName()+"正在买"+ticket+"票");
                    ticket--;
                }
            }
        }
    }
}
