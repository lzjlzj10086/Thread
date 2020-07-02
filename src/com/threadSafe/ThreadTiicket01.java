package com.threadSafe;

/**
 * 解决线程安全问题
 *      方法二 ：同步方法，使用synchronized修饰方法。
 *             把遇到出现可能出现线程安全问题的代码放在同步方法中。
 */
public class ThreadTiicket01 implements Runnable{

    //共享数据
    private int ticket = 100;


    @Override
    public void run() {
        while (true){
            ticketrun();
        }
    }
    public synchronized void ticketrun(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在买"+ticket+"票");
            ticket--;
        }
    }
}
