package MoreThread;

public class GetDcl {
    public static void main(String[] args) {
        Thread thread = new Thread(){
            @Override
            public void run() {
               while(true){

                   try {
                       sleep(1111);
                   }catch (Exception e){

                   }
                   System.out.println(DclModel.getinstance()+ "   "+this.getName());
               }
            }
        };
        thread.start();
        while(true){
            try {
                Thread.sleep(1111);
            }catch (Exception e){

            }
            System.out.println(DclModel.getinstance());
        }
    }
}
