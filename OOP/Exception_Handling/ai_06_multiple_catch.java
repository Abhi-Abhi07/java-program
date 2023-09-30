public class ai_06_multiple_catch {
    public static void main(String[] args) {
        try{
            // #1
            // int a=10/0;
            int a=20/2;
            System.out.println(a);
            // #2
            int arr[]={4,5,7,2};
            // System.out.println(arr[7]);
            System.out.println(arr[2]);
            // #3
            // String str=null;
            String str="abhi";
            System.out.println(str.toUpperCase());
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(NumberFormatException e){
            System.out.println("number exception");
        }catch(Exception e){
            System.out.println("All type exception handle");
            System.out.println(e);
        }
    }
}
