public class ai_07_nested_try {
    public static void main(String[] args) {
        System.out.println("main method start");
        try{
            // int a=10/0;
            try{
                int arr[]={3,6,1,8};
                System.out.println(arr[5]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        System.out.println("main method end");
    }
}
