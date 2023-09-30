class bank extends Thread{
    int bal;
    int withdrow;
    bank(int withdrow){
        this.bal=5000;
        this.withdrow=withdrow;
    }
    
    public synchronized void run(){ 
        String name=Thread.currentThread().getName();
        if(bal>=withdrow){
            System.out.println(name+" withdrow money "+withdrow);
            bal=bal-withdrow;
        }
        else{
            System.out.println("Sorry "+name+" unsufficient balance");
        }
    }
}
public class ai_20_customer_synPr {
    public static void main(String[] args) {
        bank b=new bank(5000);
        Thread t1=new Thread(b);
        Thread t2=new Thread(b);
        t1.setName("Krishna");
        t2.setName("Radha");

        bank b2=new bank(5000);
        Thread t3=new Thread(b2);
        Thread t4=new Thread(b2);
        t3.setName("Ram");
        t4.setName("Sita");

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}