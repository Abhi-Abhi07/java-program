import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    float percentage;
    public void input(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter student name : ");
        this.name=sc.next();
        System.out.println("Enter student roll number : ");
        this.rollNo=sc.nextInt();
        System.out.println("Enter student percentage : ");
        this.percentage=sc.nextFloat();
    }
    public void output(int i){
        System.out.println(this.name+"\t"+this.rollNo+"\t"+this.percentage+"\t"+(i+1));
    }
    public float getPercentage(){
        return this.percentage;
    }
    public void bubbleSort(Student[] arr) {
        int n=arr.length;
        Student temp;
        for(int i=0; i<n; i++){
            for(int j=1; j<(n-i); i++){
                if(arr[j-1].getPercentage()<arr[j].getPercentage()){
                    temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
}
public class ai_08 {
    public static void main(String[] args) {
        Student[] s=new Student[10];
        for(int i=0; i<3; i++){
            s[i]=new Student();
            s[i].input();
        }
        System.out.println("Student name \t rollNo \t percentage \t rank \n");
        for(int i=0; i<3;i++){
            s[i].bubbleSort(s);
            s[i].output(i);
        }
    }
}
