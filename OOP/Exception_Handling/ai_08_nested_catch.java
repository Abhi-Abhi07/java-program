public class ai_08_nested_catch {
    public static void main(String[] args) {
        System.out.println("main method start");
        try{
            int a=10/0;
        }catch(ArithmeticException e){
            System.out.println(e);
            try{
                int arr[]={3,6,1,8};
                System.out.println(arr[5]);
            }catch(ArrayIndexOutOfBoundsException a){
                System.out.println(a);
            }
        }
        System.out.println("main method end");
    }
    
}
