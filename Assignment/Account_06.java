public class Account_06 {
    public String name;
    public long accNumber;
    public float balance;
    public Account_06(String name,long accNumber,float balance){
        this.name=name;
        this.accNumber=accNumber;
        this.balance=balance;
    }
    public void addBalance(float bal){
        balance+=bal;
    }
    public void Display(){
        System.out.println("Acc holder name : "+this.name);
        System.out.println("Acc balance : "+this.balance);
        System.out.println("Acc number : "+this.accNumber);
    }
    public static void main(String[] args) {
        Account_06 a=new Account_06("Ram", 4206548, 10020);
        Account_06 b=new Account_06("Raj", 42368948, 100200);
        a.Display();
        a.addBalance(450);
        a.Display();
    }
}
