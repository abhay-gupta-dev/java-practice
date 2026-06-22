package OOP_practice.questions;

class BankAccount{
    protected int AccountNo;
    protected String holderName;
   protected double balance;

    public BankAccount(int AccountNo,String holderName,double balance){
        this.AccountNo=AccountNo;
        this.holderName=holderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            balance +=amount;
            System.out.println(amount + "₹ deposited successfully.\nThe Available balance is: " + balance);
              }else{
            System.out.println("Invalid amount deposited.");
        }

    }

    public void withdraw(double amount){
    if(amount <= 0){
        System.out.println("Invalid withdrawal amount.");
    }
    else if(amount <= balance){
        balance -= amount;
        System.out.println(amount + "₹ withdrawn successfully.\n Available balance is "+balance);
    }
    else{
        System.out.println("Insufficient balance.");
    }
}

    public void displayBalance(){
          System.out.println("Current Balance: " + balance);
    }
    public void displayAccountDetails(){
           System.out.println("Account Number: " + AccountNo);
        System.out.println("Holder Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends BankAccount{
    public SavingsAccount(int AccountNo,String holderName,double balance){
        super(AccountNo, holderName, balance);
    }

    public void calculateSimpleInterest(double rate,int years){
    double interest= (balance*rate*years)/100;
    System.out.println("Interest Earned: " + interest + "₹");
    System.out.println("Amount After Interest: " + (balance + interest) + "₹");
}
}


public class practice2 {
        public static void main(String[] args) {

        BankAccount acc1 = new BankAccount(101, "Abhay", 5000);
        acc1.deposit(500);
        acc1.withdraw(400);
        acc1.displayBalance();
        acc1.displayAccountDetails();
       

        SavingsAccount s1 = new SavingsAccount(101, "Abhay", 5000);
         s1.calculateSimpleInterest(2.3,2);




        
    }

}
