class ai_02_null_pointer_exception{
    public static void main(String[] args) {

        System.out.println("main method start");

        String str=null;
        // String str="abhi";
        System.out.println(str);
        
        try{
            System.out.println(str.toUpperCase());
            
        }
        catch (NullPointerException e) {
            System.out.println(e);
            System.out.println("null pointer hai");
        } 
        
        System.out.println("main method end");
    }
}