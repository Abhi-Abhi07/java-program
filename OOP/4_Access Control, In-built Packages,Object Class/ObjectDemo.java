public class ObjectDemo {
    int num;
    float f;

    
    public ObjectDemo(int num){
        this.num=num;
    }

    
    public ObjectDemo(int num,float f){
        this.num=num;
        this.f=f;
    }
    //@Override
    public String tostring(){
        return super.toString();
    }

    //@Override
    protected void finalize() throws Throwable{
        super.finalize();
    }

    //@Override
    public int hashCode(){
        return super.hashCode();
        // return num;
    }

    //@Override
    public boolean equals(Object obj){
        // return super.equals(obj);
        return this.num==((ObjectDemo)obj).num;
    }

    //@Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }

    public static void main(String[] args) {

        ObjectDemo obj=new ObjectDemo(12);
        ObjectDemo obj2=new ObjectDemo(12);

        //hashCose is an random integer value formed via using some algorithem
        // hashcode not an address
        //upper fun() me comment ko uncommet or uncommet ko commet karke run program
        System.out.println(obj.hashCode());
        System.out.println(obj2.hashCode());


        ObjectDemo obj3=new ObjectDemo(5,34.4f);
        ObjectDemo obj4=new ObjectDemo(5,34.4f);

        if(obj3==obj4){
            System.out.println("obj3==obj4");
        }

        //upper fun() me comment ko uncommet or uncommet ko commet karke run program
        if(obj3.equals(obj4)){
            System.out.println("obj3 equals to obj4");
        }
    }
}
