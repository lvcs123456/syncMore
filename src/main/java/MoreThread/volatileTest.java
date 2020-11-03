package MoreThread;

import java.util.concurrent.TimeUnit;

public class volatileTest extends Thread{
    /**volatile*/ static boolean tj=true;//我的环境不佳volatile,照样线程间可见,可能是缓存一致性的问题

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println(this.getName()+"开始");
                while(tj){

                }
                System.out.println(this.getName()+"结束");
            }
        };
        thread.start();
        try {
            Thread.sleep(1111);
        }catch (Exception e){

        }
        tj=false;

    }



}
