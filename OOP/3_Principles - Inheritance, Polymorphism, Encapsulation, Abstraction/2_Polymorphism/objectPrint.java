public class objectPrint {
    int num;

    public objectPrint(int num){
        this.num=num;
    }

    //comment outpput is hashcode jo ki tostring me define he (randomvalue or randomcode)
    // uncomment output is 54
    // @Override
    // public String toString() {
    //     return "objectPrint {" +
    //             "num="+ num +
    //             '}';
    // }
    public static void main(String[] args) {
        objectPrint obj=new objectPrint(54);
        //println par ctrl+click
        //then valueof par ctrl+click
        //tehn toString par ctrl+click
        //and check return type
        System.out.println(obj);

    }
}
