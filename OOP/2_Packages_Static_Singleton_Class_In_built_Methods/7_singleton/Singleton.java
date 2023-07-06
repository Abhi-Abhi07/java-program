public class Singleton {
    private Singleton(){

    }

    private static Singleton instance;

    public static Singleton getInstance(){
        //chesk wheater 1 obj only is creted or not
        if(instance == null){
            instance=new Singleton();
        }
        return instance;
    }
}
