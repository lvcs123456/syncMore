package MoreThread;

import java.util.concurrent.CyclicBarrier;

public class cyclicBarriarTest {
    public static void main(String[] args) {
        final CyclicBarrier cyclicBarrier = new CyclicBarrier(20, new Runnable() {
            public void run() {
                System.out.println("20个满了发车");
            }
        });


        for(int i=0;i<100;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        cyclicBarrier.await();
                    }catch (Exception e){

                    }

                }
            }.start();

        }

    }
}
