class Account{
    String name;
    int acc_no;
    float acc_bal;
    Account(String name, int acc_no, float acc_bal){
        this.name=name;
        this.acc_no=acc_no;
        this.acc_bal=acc_bal;
    }
    public void deposit(float bal){
        acc_bal=acc_bal+bal;
    }
    public void display(){
        System.out.println("Name : "+this.name+" !... Account number : "+acc_no+" !... Account balance : "+acc_bal);
    }
}
public class ai_06_customer {
    public static void main(String[] args) {
        Account a1=new Account("Ram",432542, 500.50f);
        Account a2=new Account("Geeta",635289,1000.50f);
        a1.display();
        a2.display();
        a1.deposit(45.45f);
        a1.display();

    }
}
