package MoreThread;

public class DclModel {
    private  volatile static DclModel instance=null;
    public static DclModel getinstance(){
       if(instance==null){
           synchronized (DclModel.class) {
               if(instance==null)  instance = new DclModel();
           }

       }
        return instance;
    }

    private DclModel(){

    }

    public static void main(String[] args) {

    }
}
