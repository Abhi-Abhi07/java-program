public class Static_polymorphism {
    
    //argument type
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b;
    }

    // ordering type
    void order(int a, string st){

    }

    void order(string st, int a){

    }
    public static void main(String[] args) {
        Static_polymorphism obj=new Static_polymorphism();
        
        obj.sum(4,5);
        obj.sum(4,5,6);

    }
}
