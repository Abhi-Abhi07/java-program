public class main {
    public static void main(String[] args) {
        son s=new son(25);
        s.carrer();
        s.partner();

        daughter d=new daughter(25);
        d.carrer();
        d.partner();

        // calling static method in abstract class
        parent.hello();
        son.hello();
        s.hello();
        daughter.hello();

        //calling normal method in abstract class
        s.normal();
        d.normal();
    }
}
