import java.util.ArrayList;

class Bank{
    private String bankName;
    private ArrayList<Customer> customers;
    public Bank(String bankName){
        this.bankName=bankName;
        this.customers=new ArrayList<>();
    }
    public String getName(){
        return bankName;
    }
    public BankAccount openAccount(Customer customer,int accountNumber,double balance){
        BankAccount account=new BankAccount(accountNumber, balance, this);
        customer.addAccount(account);
        if(!customers.contains(customer)){
            customers.add(customer);
        }
        return account;
    }
    public void displayCustomers(){
        System.out.println("Bank Name: "+bankName+" -Customers List:");
        for(Customer customer:customers){
            System.out.println(customer.getName());
        }
    }
}
class Customer{
    private String name;
    private String customerId;
    private ArrayList<BankAccount> accounts;
    public Customer(String name,String customerId){
        this.name=name;
        this.customerId=customerId;
        this.accounts=new ArrayList<>();
    }
    public String getName(){
        return name;
    }
    public void addAccount(BankAccount account){
        accounts.add(account);
        System.out.println("Account added to "+name);
    }
    public void viewBalance(){
        System.out.println("Customer Name: "+name+" Customer ID: "+customerId);
        if(accounts.isEmpty()) System.out.println("No Account");
        else{
            for(BankAccount account:accounts){
                account.display();
            }
        }
    }  
}
class BankAccount{
    private int accountNumber;
    private double balance;
    private Bank bank;
    public BankAccount(int accountNumber,double balance,Bank bank){
        this.accountNumber=accountNumber;
        this.balance=balance;
        this.bank=bank;
    }
    public void deposit(int amount){
        if(amount>0){
            balance+=amount;
            System.out.println(amount+" deposited, Current Balance: "+balance);
        }
        else System.out.println("Invalid Amount");
    }
    public void withdraw(int amount){
        if(amount>0 && amount<=balance){
            balance-=amount;
            System.out.println(amount+" withdrawn, Current Balance: "+balance);
        }
    }
    public void display(){
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Bank Name: "+bank.getName());
        System.out.println("Balance: "+balance);

    }

}
public class Program2 {
    public static void main(String[] args) {
        Bank bank1=new Bank("SBI Bank");
        Bank bank2=new Bank("Indian Bank");
        Customer customer1=new Customer("Rakesh","C101");
        Customer customer2=new Customer("Monesh","C202");
        BankAccount account1=bank1.openAccount(customer1, 101, 5000);
        BankAccount account2=bank2.openAccount(customer2, 202, 4000);
        BankAccount account3=bank1.openAccount(customer2, 203, 4500);
        account1.deposit(500);
        account1.withdraw(500);
        account2.deposit(1000);
        account3.withdraw(500);
        customer2.viewBalance();
        bank1.displayCustomers();
        bank2.displayCustomers();
    }
}
