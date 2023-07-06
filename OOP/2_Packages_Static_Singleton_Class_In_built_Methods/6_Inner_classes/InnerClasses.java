public class InnerClasses{
    static class Test{ // no error because dpend on itself
        String name;
        Test(String name){
           this.name=name; 
        }
    }
    public static void main(String[] args) {
        Test a = new Test("Ai");
        Test b = new Test("Abhi");

        System.out.println(a.name);
        System.out.println(b.name);
    }
}


// public class InnerClasses{
//     static class Test{ // no error because dpend on itself
//         static String name;
//         Test(String name){
//            Test.name=name; 
//         }
//     }
//     public static void main(String[] args) {
//         Test a = new Test("Ai");
//         Test b = new Test("Abhi");

//         System.out.println(a.name);
//         System.out.println(b.name);
//     }
// }



// public class InnerClasses{
//     class Test{ //error because depend on Inner classes
//         static String name;
//         Test(String name){
//            Test.name=name; 
//         }
//     }
//     public static void main(String[] args) {
//         Test a = new Test("Ai");
//         Test b = new Test("Abhi");

//         System.out.println(a.name);
//         System.out.println(b.name);
//     }
// }



// class Test{
//         static String name;
//         Test(String name){
//            Test.name=name; 
//         }
//     }
// public class InnerClasses{
//     public static void main(String[] args) {
//         Test a = new Test("Ai");
//         Test b = new Test("Abhi");

//         System.out.println(a.name);
//         System.out.println(b.name);
//     }
// }