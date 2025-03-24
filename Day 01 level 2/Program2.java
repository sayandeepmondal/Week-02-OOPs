class BankAccount{
    private String accountHolder;
    private int accountNumber;
    private double balance;
     
    public BankAccount(String accountHolder,int accountNumber,double balance){
        this.accountHolder=accountHolder;
        this.accountNumber=accountNumber;
        this.balance=balance;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println("Deposited: $"+amount);
        }else System.out.println("Invalid deposit amount");

    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println("Withdrawn: $"+amount);
        }else System.out.println("Insufficient Balance or Invalid Amount");
    }
    public void displayBalance(){
        System.out.println("Account Holder: "+accountHolder);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Balance: "+balance);
    }
}
public class Program2 {
    public static void main(String[] args) {
        BankAccount acnt=new BankAccount("Williams", 9094058, 25000);
        acnt.deposit(5000);
        acnt.withdraw(28000);
        acnt.displayBalance();
    } 
}
