public class ai_10_nested_finally {
    public static void main(String[] args) {
        System.out.println("main method start");
        try {
            String str="Abhi";
            System.out.println(str.toUpperCase());
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
        finally{
            try {
                int a=10/0;
                System.out.println(a);
            } catch (Exception e) {
                // TODO: handle exception
                System.out.println(e);
            }
            finally{
                System.out.println("done");
            }
            System.out.println("all done");
        }
        System.out.println("main method end");
    }
}
