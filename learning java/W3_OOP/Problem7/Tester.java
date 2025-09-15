public class Tester{
    public static void main(String[] args) {
        Bank b1= new Bank();
        
        Account a1 = new Account("Fahim", 1234, 1000);
        Account a2 = new Account("Anin", 7890, 2000);
        Account a3 = new Account("Faraz", 5678, 3000);
        b1.addaccount(a1);
        b1.addaccount(a2);
        b1.addaccount(a3);
       
        System.out.println("Availble Bank Accounts Details");
        b1.showaccountdetails();
        System.out.println("==========");
        a1.deposit(5000);
        System.out.println("==========");
        a1.withdraw(3000);

        System.out.println("==========");
        // b1.deleteacc(1);
        // b1.showaccountdetails();


        

        
    }
}