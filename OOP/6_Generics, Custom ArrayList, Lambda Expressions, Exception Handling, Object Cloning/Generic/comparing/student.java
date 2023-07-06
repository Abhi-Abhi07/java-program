public class student implements Comparable<student> {
    int rollNo;
    float marks;

    student(int rollNo, float marks){
        this.rollNo=rollNo;
        this.marks=marks;
    }

    // @Override
    public int compareTo(student o){
        int diff=(int)(this.marks-o.marks);
        return diff;
    }
}
