package MoreThread;

public class sync extends Thread{
    public static void main(String[] args) {
    final Object o=new Object();
        Thread thread1 = new Thread(new sync()){
            @Override
            public  void run()  {
                synchronized (o) {
                    while (true) {
                        System.out.println(this.getClass().getName());
                        System.out.println("2");

                    }
                }
                }
        };



        Thread thread = new Thread(new sync()) {
            @Override
            public  void run() {
                synchronized (o) {
                    while (true) {
                        System.out.println(this.getClass().getName());
                        System.out.println("1");
                    }
                }
            }


        };




        thread1.start();
thread.start();

    }
}
