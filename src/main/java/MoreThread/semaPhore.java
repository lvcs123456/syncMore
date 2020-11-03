package MoreThread;

import java.util.concurrent.Semaphore;

public class semaPhore {
    public static void main(String[] args) {
        final Semaphore semaphore = new Semaphore(2,true);

        for(int i=0;i<100;i++){
            new Thread(){
                @Override
                public void run() {
                    try {
                        semaphore.acquire();
                        System.out.println(this.getName());
                        sleep(111);
                    }catch (Exception e){

                    }finally {
                        semaphore.release();
                    }

                }
            }.start();
        }

    }
}
