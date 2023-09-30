class bus implements Runnable{
    int passenger;
    int availableSeat;
    public bus(int passenger){
        this.passenger=passenger;
        this.availableSeat=1;
    }
    public synchronized void run(){ //solution
        String name=Thread.currentThread().getName();
        if(availableSeat>=passenger){
            System.out.println(name+" Resrved Seat...!");
            availableSeat=availableSeat-passenger;
        }
        else{
            System.out.println("Seat not available for "+name);
        }
    }
}
public class ai_17_customer_mutithreading_solution {
    public static void main(String[] args) {
        bus r=new bus(1);

        Thread t1=new Thread(r);
        Thread t2=new Thread(r);
        Thread t3=new Thread(r);

        t1.setName("Ram");
        t2.setName("Shyam");
        t3.setName("Geeta");

        t1.start();
        t2.start();
        t3.start();
    }
}
