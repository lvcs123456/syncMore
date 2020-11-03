package MoreThread;

import java.util.concurrent.locks.ReentrantLock;

public class ReentrantLockIm extends Thread{




    public synchronized void Mothed1(){
       this.Mothed2();
        while(true){

            try {
                sleep(1111);
            }catch (Exception e){}
            System.out.println(1);
        }
    }
    public synchronized void Mothed2(){

            System.out.println(2);

    }

    public static void main(String[] args) {
        final ReentrantLockIm reentrantLockIm = new ReentrantLockIm();
        ReentrantLock reentrantLock = new ReentrantLock(true);//未用用来查看公平所源码
        new Thread(){
            @Override
            public void run() {
                reentrantLockIm.Mothed1();
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                //reentrantLockIm.Mothed1();

            }
        }.start();



    }
}
