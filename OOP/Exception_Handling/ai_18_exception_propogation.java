public class ai_18_exception_propogation {
    public static void main(String[] args) {
        try {
            m1();
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e);
        }
    }
    public static void m1() {
        m2();
    }
    public static void m2() {
        System.out.println(10/0);
    }
}
