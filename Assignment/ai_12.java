class Student{
    public String name;
    public int rollNo;
    public void input(String name, int rollNo){
        this.name=name;
        this.rollNo=rollNo;
    }
    public void output(){
        System.out.println("Student name is : "+this.name);
        System.out.println("Student roll no. is : "+this.rollNo);
    }
}
class Test extends Student{
    float phyMraks;
    float mathMarks;
    public void inputMarks(float phyMraks,float mathMarks){
        this.phyMraks=phyMraks;
        this.mathMarks=mathMarks;
    }
    public void display(){
        System.out.println("Phy marks is : "+this.phyMraks);
        System.out.println("Math marks is : "+this.mathMarks);
    }
}
class Result extends Test{
    float totalMarks;
    public void Totalmarks(){
        this.totalMarks=phyMraks+mathMarks;
    }
    public void display(){
        Totalmarks();
        System.out.println(name+"Your total marks are : "+totalMarks);
    }
}
public class ai_12 {
    public static void main(String[] args) {
        Result r=new Result();
        r.input("Abhi", 1);
        r.inputMarks(78.9f, 91.5f);
        r.display();
    }
}
