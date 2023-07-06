public class main {
    public static void main(String[] args) {
        student Ai= new student(23, 99.4f);
        student Ab=new student(1, 89.9f);

        System.out.println(Ab.compareTo(Ai));
        if(Ab.compareTo(Ai) < 0){
            System.out.println("Ai has more marks");
        }
    }
}
