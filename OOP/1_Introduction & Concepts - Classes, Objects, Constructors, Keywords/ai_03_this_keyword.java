import java.util.*;

import javax.sql.rowset.spi.SyncResolver;
	public class ai_03_this_keyword{
		public static void main(String[] args){

			student Abhi = new student();
            student Ab = new student();


            // Abhi.greeting();


			// System.out.println(Abhi.rollNo);
			// System.out.println(Abhi.name);
			// System.out.println(Abhi.marks);

            // Abhi.rollNo=7;
            // Ab.rollNo=7;
            // System.out.println(Ab.rollNo);
			// System.out.println(Ab.name);
			// System.out.println(Ab.marks);


            // Abhi.changeName("Raj");


            student Raj=new student("Pyari",101,99.99f);
            System.out.println(Raj.rollNo);
			System.out.println(Raj.name);
			System.out.println(Raj.marks);


            student random=new student(Raj);
            System.out.println(random.rollNo);
			System.out.println(random.name);
			System.out.println(random.marks);
		}
	}
	class student{
		int rollNo;
		String name;
		float marks;
		
        void greeting(){
            System.out.println("Hello ! " + this.name);
            System.out.println("Hello ! " + name);
        }

        void changeName(String name){
            
            System.out.println("change name : "+name);//name change hoga
            System.out.println("change name : "+this.name);//name change nhi hoga
            //because this keyword replaced by current object kar rha hai
        }

		student(){
			this.rollNo=5;
			this.name="Ai";
			this.marks=89.45f;
		}

        //working
        //student student Raj=new student("Pyari",101,99.99f);
        //here, this will be replaced with Raj
        student(String name, int rollNo, float marks){
            //Use this
            this.rollNo=rollNo;
			this.name=name;
			this.marks=marks;

            // //show deafult value and maybe error
            // rollNo=rollNo;
			// name=name;
			// marks=marks;
        }

        student(student other){
            this.rollNo=other.rollNo;
            this.name=other.name;
            this.marks=other.marks;
        }
	}