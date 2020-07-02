package com.threadSafe.lock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 解决线程安全问题
 *      方法四：使用lock锁，方法lock（）获取锁unlck（）释放锁
 *              在成员变量创建lock实现类ReentrantLock
 *             把遇到出现可能出现线程安全问题的代码前使用lock（）方法，
 *              把遇到出现可能出现线程安全问题的代码后使用unlock（）方法，
 */
public class ThreadTiicket implements Runnable{

    //共享数据
    private int ticket = 100;

    Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true){
           lock.lock();
           try{
               if (ticket>0){
                   System.out.println(Thread.currentThread().getName()+"正在买"+ticket+"票");
                   ticket--;
               }
           }catch (Exception e){
               e.printStackTrace();
           }finally {
               lock.unlock();
           }
        }
    }
}
