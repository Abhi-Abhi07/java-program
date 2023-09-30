public class ai_15_throw_vs_throws {

    void div(int a, int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException();
        }
        else{
            System.out.println(a/b);
        }
    }
    public static void main(String[] args){
        ai_15_throw_vs_throws a=new ai_15_throw_vs_throws();
        a.div(10,0);

        // try {
        //     a.div(10,0);
        // } catch (Exception e) {
        //     // TODO: handle exception
        //     System.out.println("value of b is 0");
        // }
    }
}
