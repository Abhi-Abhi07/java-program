public class Main{
    public static void main(String[] args) {
        Box box=new Box();
        // Box box=new Box(5.56);
        // Box box=new Box(5,7.9,8.99);

        // System.out.println(box.l+" "+box.w+" "+box.number);//show error because number is private

        Box box1=new Box(5.2,6.78,7);
        Box box2=new Box(box1);

        System.out.println(box2.l+" "+box2.w+" "+box2.h);

        BoxWeight box3=new BoxWeight(2, 4, 5.6, 23);
        System.out.println(box3.l+" "+box3.weight);

        Box box4=new BoxWeight(2, 7, 8, 9); // weight ko initialize kar sakte hai but access nhi kar sakte he
        System.out.println(box4.l);
        System.out.println(box4.w);
        System.out.println(box4.h);
        // System.out.println(box4.weight);//can't access

        //there are many variable in both parent and child classes
        //You are given access to variables that are in the ref type i.e. Boxweight
        //hence you should have access to weight variable
        //this also means, that the ones you are typing to access should be initialised
        //but here,when the obj itself is of type parent class, how will you call the constructor of child class
        //this is why error
        // BoxWeight box5=new box(7, 8, 9);
        // System.out.println(box5.l);       

    }
}
