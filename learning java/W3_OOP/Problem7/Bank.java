// Write a Java program to create a class called "Bank" with a collection of accounts and methods to add and remove accounts, and to deposit and withdraw money. Also define a class called "Account" to maintain account details of a particular customer.

public class Bank {

    public Account[] acc = new Account[5];
    public int account = 0;

    //private static int newbalance = 0;

    public void addaccount(Account a) {
        acc[account] = a;
        account++;
    }

//Issue is in bank class updating the all the accounts' balance value is happened with the static newbalance value which should not be a proper way. THE MAIN BALANCE OF AN ACCOUNT IS NOT UPDATED. So taking them in the account class to update
    
    // public void deposit(Account a, int b) {
    //     System.out.println("Deposit for: " + a.getname());
    //     Bank.newbalance = a.get_balance() + b;
    //     System.out.println("Newbalance of the Account: " + Bank.newbalance);
    // }

    // public void withdraw(Account a, int b) {
    //     System.out.println("Withdraw for: " + a.getname());
    //     Bank.newbalance = Bank.newbalance - b;
    //     System.out.println("Newbalance of the Account: " + Bank.newbalance);
    // }

    public void showaccountdetails() {
        for (int i = 0; i < account; i++) {
            System.out.println(acc[i].getname() + " " + acc[i].get_acc() + " " + acc[i].get_balance());
        }
    }
    public void deleteacc(int delete)
    {
       for(int i = delete ;i <account -1 ;i++)
       {
        acc[i] =acc[i+1];
       }
       account--;
       acc[account]=null;
    }
}
