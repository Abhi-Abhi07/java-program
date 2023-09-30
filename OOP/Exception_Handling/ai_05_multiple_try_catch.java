public class ai_05_multiple_try_catch {
    public static void main(String[] args) {
        try{
            int a=10/0;
            System.out.println(a);
        }catch(ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        try {
            int arr[]={1,2,3,4,5};
            System.out.println(arr[3]);
            System.out.println(arr[7]);
        } catch (ArrayIndexOutOfBoundsException e) {
            // System.out.println("can't access arr[7] because arrar size is 5");
            System.out.println("beyond the array limit");
        }

    }
}
