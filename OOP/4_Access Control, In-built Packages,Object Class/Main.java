package access;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {

        A a=new A("Abhi",10);
        //need to do a few thing
        // access the data member 
        // modify the data member

        // ArrayList <Integer> list=new ArrayList<>();
        // list.DEFAULT_CAPACITY;//show error because DEFAULT_CAPACITY is private

        int number=a.num;
        System.out.println(number);//output is 10 
        //because same packages me super class ke date member by default public hote hai
        // but defferent packages me private hote hai
        // yha A.java or Main.java same package me hai (package name->access)
        //Example ke liye private.java ko dekhe

        a.set(20);

        int getnum=a.get();
        System.out.println(getnum);
    }
    
}
