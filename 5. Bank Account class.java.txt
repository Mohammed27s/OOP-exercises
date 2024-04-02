
//Create a class named BankAccount with private attributes
// for accountNumber, balance, and ownerName. Implement methods
// to deposit and withdraw money from the account.

public class BankAccount {

    //Bank attributes
    private String accountNumber;
    private Double balance;
    private String ownerName;

    //Constructor

    public BankAccount(String accountNumber, Double balance, String ownerName){

        this.accountNumber = accountNumber;
        this.balance = balance;
        this.ownerName = ownerName;


    }

    //Getter

    public String getAccountNumber(){

        return accountNumber;
    }

    public String getOwnerName(){

        return ownerName;
    }

    public Double getBalance(){

        return balance;
    }

    //Setter
   // This will be updated when client  deposit and withdraw money from the account.
    public void setBalance(Double balance){

        this.balance = balance;

    }

    //Methods deposit and withdraw

    public Double balanceDeposit(Double deposit){

        deposit = this.balance = getBalance();

        return  deposit;
    }

   






    public static void main(String[] args){

        System.out.println("Welcome to your Bank Account"+"\n");
        BankAccount bank = new BankAccount("56774663623", 1000.0, "Mohammed");

        System.out.println("The user name "+bank.getOwnerName()+" with accountNumber "+bank.getOwnerName()+"\n"+
                " your current balance is "+bank.getBalance()+"\n");


        System.out.println("*** withdraw system ***"+"\n");
        System.out.println("Enter the amount you want to withdraw: ");
        bank.setBalance(500.0);

        System.out.println("==========================================");

        System.out.println("Your current balance is "+bank.getBalance());





    }
}
