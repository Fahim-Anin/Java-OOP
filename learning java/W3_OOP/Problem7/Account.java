

public class Account{
    private String name;
    private int account_number;
    private int balance;

    public Account(String name, int account_number, int balance)
    {
        this.name=name;
        this.account_number=account_number;
        this.balance =balance;

    }
    public String  getname()
    {
        return name;
    }
     public int get_acc()
     {
        return account_number;
     }
     public int get_balance()
     {
        return balance;
     }

    public void deposit(int b) {
        
        this.balance = this.balance + b;
        System.out.println("Deposit for "+ name+ " " +" Newbalance of the Account: " + this.balance);
    }

    public void withdraw( int b) {
        
        this.balance = this.balance - b;
         System.out.println("Withdraw "+ name+ " " +" Newbalance of the Account: " + this.balance);
    }
    

}