package MoreThread;

import java.util.concurrent.TimeUnit;

public class volatileTest extends Thread{
    /**volatile*/ static boolean tj=true;//�ҵĻ�������volatile,�����̼߳�ɼ�,�����ǻ���һ���Ե�����

    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
                System.out.println(this.getName()+"��ʼ");
                while(tj){

                }
                System.out.println(this.getName()+"����");
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
