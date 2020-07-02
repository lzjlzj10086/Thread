package com.threadSafe;

/**
 * 解决线程安全问题
 *      方法三 ：静态同步方法，使用static synchronized修饰方法。
 *             把遇到出现可能出现线程安全问题的代码放在静态同步方法中。
 */
public class ThreadTiicket02 implements Runnable{

    //共享数据
    private static int ticket = 100;


    @Override
    public void run() {
        while (true){
            ticketrunstatic();
        }
    }
    public static synchronized void ticketrunstatic(){
        if (ticket>0){
            System.out.println(Thread.currentThread().getName()+"正在买"+ticket+"票");
            ticket--;
        }
    }
}
