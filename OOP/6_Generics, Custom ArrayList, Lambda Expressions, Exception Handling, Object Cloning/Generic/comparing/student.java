public class student implements Comparable<student> {
    int rollNo;
    float marks;

    student(int rollNo, float marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }
    //sort based on marks
    // @Override
    // public String toString(){
    //     return rollNo+"";
    // }
    //sort based on marks 
    @Override
    public String toString(){
        return marks+"";
    }

    @Override
    public int compareTo(student o){
        System.out.println("in compare to method");
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
