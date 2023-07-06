import access.A;
public class privat {
    public static void main(String[] args) {
        A a=new A("Ai",34);

        // int number=a.num();//show error
        //because defferent packages me super class ke date member by default private hote hai
        // but same packages me public hote hai
        // yha A.java or Main.java defferent package me hai
        //Example ke liye Main.java ko dekhe

        a.set(20);
        
        int getnum=a.get();
        System.out.println(getnum);
    }
    
}
