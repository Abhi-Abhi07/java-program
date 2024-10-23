public class ai_03_NFE{
    public static void main(String[] args) {
        System.out.println("main methed start");
        // case: 1 normal temination
        String str="123";
        try{
            int a=Integer.parseInt(str);
            System.out.println(a);
        }
        catch(NumberFormatException n){
            System.out.println("String "+str+" can't be converated in integer");
        }
        System.out.println("main methed end");

        // // case: 2 normal temination
        // String str="Abhi";
        // try{
        //     int a=Integer.parseInt(str);
        //     System.out.println(a);
        // }
        // catch(NumberFormatException n){
        //     System.out.println("String "+str+" can't be converated in integer");
        // }
        // System.out.println("main methed end");

        // // case: 3 Abnormal temination
        // String str="Abhi";
        // try{
        //     int a=Integer.parseInt(str);
        //     System.out.println(a);
        // }
        // catch(ArithmeticException n){
        //     System.out.println("String "+str+" can't be converated in integer");
        // }
        // System.out.println("main methed end");
    }
}