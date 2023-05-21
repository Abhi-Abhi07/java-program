import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
	public class calling_a_cnstructor_from_anoter_constructor_04{
		public static void main(String[] args){

            student Duggu = new student();
            System.out.println(Duggu.rollNo);
			System.out.println(Duggu.name);
			System.out.println(Duggu.marks);


			// one student name into another student
			student one = new student();
			student another = one;

			one.name="Akshay";
			System.out.println("another student name is : "+another.name);
		}
	}
	class student{
		int rollNo;
		String name;
		float marks;

		student(){
            //this is how you call a constructor from another constructor
            //internally : new student("Doli",13,40.36f)
            this ("Doli",13,40.36f);
		}

        student(String name, int rollNo, float marks){
            this.rollNo=rollNo;
			this.name=name;
			this.marks=marks;
        }
	}