package MoreThread;

import java.util.concurrent.TimeUnit;

public class volatileTest extends Thread{
    /**volatile*/  boolean tj=true;//�ҵĻ�������volatile,�����̼߳�ɼ�,�����ǻ���һ���Ե�����

    public static void main(String[] args) {
        final volatileTest volatileTest = new volatileTest();
        Thread thread = new Thread(volatileTest){
            @Override
            public void run() {
                System.out.println(this.getName()+"��ʼ");
                while(volatileTest.tj){

                }
                System.out.println(this.getName()+"����");
            }
        };
        thread.start();
        try {
            Thread.sleep(1111);
        }catch (Exception e){

        }
        volatileTest.tj=false;

    }



}
