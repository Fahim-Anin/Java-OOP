public class Tester{
    public static void main(String[] args) {
        Inventory i1= new Inventory();
        Product p1 = new Product("Pen", 100 );
        Product p2 = new Product("Computer", 50);
        i1.addinv(p1);
        i1.addinv(p2);

        i1.showinvdetails();
        p1.quantity();
        System.out.println(p1.component);
        // int i =1;
        // do { 
        //     System.out.println("Hello");
        // } while (i<=5);
    }
}