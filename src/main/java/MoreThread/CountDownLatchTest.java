package MoreThread;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchTest {
    public static void main(String[] args) throws  Exception{
        Thread[] threadG = new Thread[10011];

        final CountDownLatch countDownLatch = new CountDownLatch(threadG.length);

        for(Thread t:threadG){
            new Thread(){
                @Override
                public void run() {
                    countDownLatch.countDown();
                }
            }.start();

        }System.out.println(countDownLatch.getCount());
        countDownLatch.await();
        System.out.println("³ÌÐòÍê³É");

    }

}
