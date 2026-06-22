public class single{
    public static void main(String args[]){
        BankAccount myacc=new BankAccount("Abhay Gupta",22345666,340000.09);
        myacc.deposit(23000);
        myacc.withdraw(150000);
        myacc.displayAccountInfo();


    }
}
class BankAccount{
    protected String accountHolder;
    protected int accountNo;
    protected double balance;

    public BankAccount(String accountHolder, int accountNo,double balance ){
        this.accountHolder=accountHolder;
        this.accountNo=accountNo;
        this.balance=balance;
    }
    public void deposit(double amount){
        balance +=amount;
        System.out.println(amount+ " deposited");
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance -=amount;
            System.out.println(amount+ " withdrawn");
        }else{
            System.out.println("insufficient balance.");
        }
    }
     public void displayAccountInfo() {
        System.out.println("\nAccount Holder : " + accountHolder);
        System.out.println("Account Number : " + accountNo);
        System.out.println("Balance        : " + balance);
    }
}