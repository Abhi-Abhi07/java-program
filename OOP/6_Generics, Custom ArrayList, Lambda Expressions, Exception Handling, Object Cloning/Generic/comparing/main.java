import java.util.*;

public class main {
    public static void main(String[] args) {
        // student Ai= new student(23, 99.4f);
        // student Ab=new student(1, 89.9f);

        // System.out.println(Ab.compareTo(Ai));
        // if(Ab.compareTo(Ai) < 0){
        //     System.out.println("Ai has more marks");
        // }


        student Ai= new student(23, 99.4f);
        student Ab=new student(1, 89.9f);
        student krishna=new student(5, 95.9f);
        student ravi=new student(15, 79.9f);
        student Abhi=new student(7, 69.9f);

        student[] list={Ai,Ab,krishna,ravi,Abhi};

        System.out.println(Arrays.toString(list));
        
        // Arrays.sort(list);

        //assending order
        // Arrays.sort(list,new Comparator<student>(){
        // public int compare(student o1,student o2){
        //     return (int)(o1.marks-o2.marks);
        // }
        // });

        //dessending order
        // Arrays.sort(list,new Comparator<student>(){
        // public int compare(student o1,student o2){
        //     return -(int)(o1.marks-o2.marks);
        // }
        // });

        //lamda expression
        Arrays.sort(list, (o1,o2) -> -(int) (o1.marks-o2.marks));

        System.out.println(Arrays.toString(list));

    }
}













